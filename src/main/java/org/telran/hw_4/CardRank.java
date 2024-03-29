package org.telran.hw_4;

public enum CardRank {
    ONE(0), TWO(1), THREE(2),
    FOUR(3), FIVE(4), SIX(5),
    SEVEN(6), EIGHT(7), NINE(8),
    TEN(9), JACK(10), QUEEN(11),
    KING(12), ACE(13);

    private final int rank;

    public int getRank() {
        return rank;
    }

    CardRank(int rank) {
        this.rank = rank;
    }
}
