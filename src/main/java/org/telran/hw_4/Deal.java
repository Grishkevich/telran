package org.telran.hw_4;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Deal {
    static final int cardsForPlayer = 5;
    private final List<Card> deck;
    private LinkedList<Card> sortedDeck;

    public Deal() {
        this.deck = Card.createDeck();
    }

    public List<Card> getDeck() {
        return deck;
    }

    private void deckShuffling() {
        Collections.shuffle(deck);
    }

    private LinkedList<Card> getSortedDeck() {
        deckShuffling();
        return new LinkedList<>(getDeck());
    }

    public void dealTheCards(List<Player> playerList, int players) {
        sortedDeck = getSortedDeck();
        for (int i = 0; i < cardsForPlayer; i++) {
            for (int y = 0; y < players; y++) {
                playerList.get(y).getCards().add(sortedDeck.poll());
            }
        }
    }

    public void printCards(List<Player> playerList) {
        AtomicInteger i = new AtomicInteger(0);
        playerList.forEach(player -> {
            System.out.println("Player " + i.incrementAndGet() + " cards:");
            player.getCards().forEach(System.out::println);
            System.out.println();
        });
    }

    public static void main(String[] args) {
        Deal deal = new Deal();
        List<Player> playerList = new ArrayList<>();
        int players;

        final Scanner sc = new Scanner(System.in);
        final Random random = new Random();

        final int numberOfCards = deal.getDeck().size(); // number of cards

        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) {
                    playerList = IntStream.range(0, players).mapToObj(operand -> new Player()).toList();
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }

        deal.dealTheCards(playerList, players);
        deal.printCards(playerList);

    }
}
