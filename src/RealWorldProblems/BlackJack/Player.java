package RealWorldProblems.BlackJack;

import RealWorldProblems.BlackJack.model.Card;
import RealWorldProblems.BlackJack.model.Hand;

public abstract class Player {

    protected Hand hand = new Hand();

    public void addCard(Card card){
        hand.addCard(card);
    }

    public int getHandScore(){
        return hand.getScore();
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
