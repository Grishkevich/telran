package org.telran.hw_4;

import java.util.Arrays;
import java.util.List;

public class Card {
    private final CardRank rank;
    private final CardSuit suit;

    public Card(CardSuit suit, CardRank rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public static List<Card> createDeck() {
        return Arrays.asList(
                new Card(CardSuit.CLUBS, CardRank.ONE),
                new Card(CardSuit.CLUBS, CardRank.TWO),
                new Card(CardSuit.CLUBS, CardRank.THREE),
                new Card(CardSuit.CLUBS, CardRank.FOUR),
                new Card(CardSuit.CLUBS, CardRank.FIVE),
                new Card(CardSuit.CLUBS, CardRank.SIX),
                new Card(CardSuit.CLUBS, CardRank.SEVEN),
                new Card(CardSuit.CLUBS, CardRank.EIGHT),
                new Card(CardSuit.CLUBS, CardRank.NINE),
                new Card(CardSuit.CLUBS, CardRank.TEN),
                new Card(CardSuit.CLUBS, CardRank.JACK),
                new Card(CardSuit.CLUBS, CardRank.QUEEN),
                new Card(CardSuit.CLUBS, CardRank.KING),
                new Card(CardSuit.CLUBS, CardRank.ACE),
                new Card(CardSuit.HEARTS, CardRank.ONE),
                new Card(CardSuit.HEARTS, CardRank.TWO),
                new Card(CardSuit.HEARTS, CardRank.THREE),
                new Card(CardSuit.HEARTS, CardRank.FOUR),
                new Card(CardSuit.HEARTS, CardRank.FIVE),
                new Card(CardSuit.HEARTS, CardRank.SIX),
                new Card(CardSuit.HEARTS, CardRank.SEVEN),
                new Card(CardSuit.HEARTS, CardRank.EIGHT),
                new Card(CardSuit.HEARTS, CardRank.NINE),
                new Card(CardSuit.HEARTS, CardRank.TEN),
                new Card(CardSuit.HEARTS, CardRank.JACK),
                new Card(CardSuit.HEARTS, CardRank.QUEEN),
                new Card(CardSuit.HEARTS, CardRank.KING),
                new Card(CardSuit.HEARTS, CardRank.ACE),
                new Card(CardSuit.SPADES, CardRank.ONE),
                new Card(CardSuit.SPADES, CardRank.TWO),
                new Card(CardSuit.SPADES, CardRank.THREE),
                new Card(CardSuit.SPADES, CardRank.FOUR),
                new Card(CardSuit.SPADES, CardRank.FIVE),
                new Card(CardSuit.SPADES, CardRank.SIX),
                new Card(CardSuit.SPADES, CardRank.SEVEN),
                new Card(CardSuit.SPADES, CardRank.EIGHT),
                new Card(CardSuit.SPADES, CardRank.NINE),
                new Card(CardSuit.SPADES, CardRank.TEN),
                new Card(CardSuit.SPADES, CardRank.JACK),
                new Card(CardSuit.SPADES, CardRank.QUEEN),
                new Card(CardSuit.SPADES, CardRank.KING),
                new Card(CardSuit.SPADES, CardRank.ACE),
                new Card(CardSuit.DIAMONDS, CardRank.ONE),
                new Card(CardSuit.DIAMONDS, CardRank.TWO),
                new Card(CardSuit.DIAMONDS, CardRank.THREE),
                new Card(CardSuit.DIAMONDS, CardRank.FOUR),
                new Card(CardSuit.DIAMONDS, CardRank.FIVE),
                new Card(CardSuit.DIAMONDS, CardRank.SIX),
                new Card(CardSuit.DIAMONDS, CardRank.SEVEN),
                new Card(CardSuit.DIAMONDS, CardRank.EIGHT),
                new Card(CardSuit.DIAMONDS, CardRank.NINE),
                new Card(CardSuit.DIAMONDS, CardRank.TEN),
                new Card(CardSuit.DIAMONDS, CardRank.JACK),
                new Card(CardSuit.DIAMONDS, CardRank.QUEEN),
                new Card(CardSuit.DIAMONDS, CardRank.KING),
                new Card(CardSuit.DIAMONDS, CardRank.ACE)
        );
    }

    @Override
    public String toString() {
        return suit + " " + rank;
    }
}
