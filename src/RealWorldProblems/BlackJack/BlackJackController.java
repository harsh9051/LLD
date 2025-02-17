package RealWorldProblems.BlackJack;

public class BlackJackController {

    public boolean playAction(String action){
        return action.equals("h") || action.equals("s");
    }
}
