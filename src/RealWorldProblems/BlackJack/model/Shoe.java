package RealWorldProblems.BlackJack.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shoe {

    private List<Deck> decks = new ArrayList<>();
    private int numberOfDecks;

    public Shoe(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
        for(int i = 0; i < numberOfDecks; i++){
            decks.add(new Deck());
        }
    }

    public Card dealCard(){
        return decks.get(0).getCard();
    }

    public void shuffle(){
        Collections.shuffle(decks);
    }


}
