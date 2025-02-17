package RealWorldProblems.BlackJack.StateDesign;

import RealWorldProblems.BlackJack.BlackJackGame;

public class EndGameState implements GameState{
    @Override
    public void playGame(BlackJackGame blackJackGame) {
        blackJackGame.determineWinner();
    }
}
