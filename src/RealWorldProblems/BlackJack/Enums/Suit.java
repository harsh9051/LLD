package RealWorldProblems.BlackJack.Enums;

public enum Suit {
    HEARTS("HEARTS"),
    DIAMOND("DIAMOND"),
    SPADES("SPADES"),
    CLUBS("CLUBS");

    public final String value;

    Suit(String value) {
        this.value = value;
    }
}
