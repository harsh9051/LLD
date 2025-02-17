package RealWorldProblems.BlackJack.StateDesign;

import RealWorldProblems.BlackJack.BlackJackGame;

public class ShuffleGameState implements GameState{
    @Override
    public void playGame(BlackJackGame blackJackGame) {
        System.out.println("Shuffling the deck");
        blackJackGame.getShoe().shuffle();
        blackJackGame.setGameState(new DealCardState());
        blackJackGame.play();
    }
}
