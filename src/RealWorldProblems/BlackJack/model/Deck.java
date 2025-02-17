package RealWorldProblems.BlackJack.model;

import RealWorldProblems.BlackJack.Enums.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        for(Suit suit : Suit.values()){
            for(int i = 1; i <= 13; i++){
                cards.add(new Card(suit, i));
            }
        }
        Collections.shuffle(cards);
    }

    public Card getCard(){
        int value = (int) (Math.random() * 52) + 1;
        Card card1 = cards.get(value-1);
        cards.remove(card1);
        return card1;
    }
}
