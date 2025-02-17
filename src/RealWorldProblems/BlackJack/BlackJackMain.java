package RealWorldProblems.BlackJack;

import RealWorldProblems.BlackJack.model.Hand;
import RealWorldProblems.BlackJack.model.Shoe;

public class BlackJackMain {
    public static void main(String[] args) {

        Shoe shoe = new Shoe(1);
        BlackJackPlayer player1 = new BlackJackPlayer(100);
        Dealer dealer1 = new Dealer();
        BlackJackGame game = new BlackJackGame(dealer1, player1, shoe, new BlackJackController());
        game.play();

    }
}
