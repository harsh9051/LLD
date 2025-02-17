package RealWorldProblems.BlackJack.StateDesign;

import RealWorldProblems.BlackJack.BlackJackGame;

public class DealerState implements GameState{
    @Override
    public void playGame(BlackJackGame blackJackGame) {
        int current_score = blackJackGame.getDealer().getTotalScore();
        while (current_score < 17) {
            blackJackGame.getDealer().getHand().addCard(blackJackGame.getShoe().dealCard());
        }
        blackJackGame.setGameState(new EndGameState());
        blackJackGame.play();
    }
}
