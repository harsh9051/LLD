package RealWorldProblems.BlackJack.model;

import LSP.Car;
import RealWorldProblems.BlackJack.Enums.Suit;

public class Card {

    private Suit suit;
    private int faceValue;

    public Card(Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
}
