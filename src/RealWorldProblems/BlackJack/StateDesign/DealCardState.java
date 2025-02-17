package RealWorldProblems.BlackJack.StateDesign;

import RealWorldProblems.BlackJack.BlackJackGame;

public class DealCardState implements GameState{
    @Override
    public void playGame(BlackJackGame blackJackGame) {
        System.out.println("Dealing Cards....");
        blackJackGame.dealInitialCards();
        blackJackGame.setGameState(new PlayerTurnState());
        blackJackGame.play();
    }
}
