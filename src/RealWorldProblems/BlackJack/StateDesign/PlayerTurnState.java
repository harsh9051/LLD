package RealWorldProblems.BlackJack.StateDesign;

import RealWorldProblems.BlackJack.BlackJackGame;

import java.util.Scanner;

public class PlayerTurnState implements GameState{
    @Override
    public void playGame(BlackJackGame blackJackGame) {
        System.out.println("Player Turn State....");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Do you want to hit or stand enter h/s");
            String action = sc.nextLine();
            if(blackJackGame.getBlackJackController().playAction(action)){
                if(action.equals("h")){
                    blackJackGame.getBlackJackPlayer().addCard(blackJackGame.getShoe().dealCard());
                    if(blackJackGame.getBlackJackPlayer().getHandScore() > 21){
                        System.out.println("Burst Game");
                        blackJackGame.setGameState(new EndGameState());
                        break;
                    }else{
                        blackJackGame.setGameState(new DealerState());
                    }
                }
            }else{
                System.out.println("Invalid action please ");
            }
        }

        blackJackGame.play();
    }
}
