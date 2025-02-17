package RealWorldProblems.BlackJack;

import RealWorldProblems.BlackJack.StateDesign.GameState;
import RealWorldProblems.BlackJack.StateDesign.ShuffleGameState;
import RealWorldProblems.BlackJack.model.Shoe;

public class BlackJackGame {

    private GameState gameState;
    private Dealer dealer;
    private BlackJackPlayer blackJackPlayer;
    private Shoe shoe;
    private BlackJackController blackJackController;

    public BlackJackGame(Dealer dealer, BlackJackPlayer blackJackPlayer, Shoe shoe, BlackJackController blackJackController) {
        this.dealer = dealer;
        this.blackJackPlayer = blackJackPlayer;
        this.shoe = shoe;
        this.blackJackController = blackJackController;
        this.gameState = new ShuffleGameState();
    }

    public void play() {
        gameState.playGame(this);
    }

    public void dealInitialCards() {
        blackJackPlayer.hand.addCard(shoe.dealCard());
        blackJackPlayer.hand.addCard(shoe.dealCard());
        dealer.hand.addCard(shoe.dealCard());
        dealer.hand.addCard(shoe.dealCard());
    }

    public void determineWinner() {
        int playerScore = blackJackPlayer.hand.getScore();
        int dealerScore = dealer.getTotalScore();
        System.out.println("Player Score: " + playerScore);
        System.out.println("Dealer Score: " + dealerScore);

        if (playerScore > 21) {
            System.out.println("Dealer wins!");
        } else if (dealerScore > 21 || playerScore > dealerScore) {
            System.out.println("Player wins!");
        } else if (playerScore == dealerScore) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("Dealer wins!");
        }
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public BlackJackPlayer getBlackJackPlayer() {
        return blackJackPlayer;
    }

    public void setBlackJackPlayer(BlackJackPlayer blackJackPlayer) {
        this.blackJackPlayer = blackJackPlayer;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    public BlackJackController getBlackJackController() {
        return blackJackController;
    }

    public void setBlackJackController(BlackJackController blackJackController) {
        this.blackJackController = blackJackController;
    }
}
