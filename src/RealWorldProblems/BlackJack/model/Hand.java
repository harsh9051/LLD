package RealWorldProblems.BlackJack.model;

import LSP.Car;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cards = new ArrayList<>();

    public void addCard(Card card){
        cards.add(card);
    }

    public int getScore(){
        int score = 0;
        for(Card card : cards){
            score = score + card.getFaceValue();
        }
        return score;
    }
}
