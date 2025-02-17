package RealWorldProblems.BlackJack;

public class BlackJackPlayer extends Player{
    private int totalCash;
    private int bet;

    public BlackJackPlayer(int cash) {
        this.totalCash = cash;
    }

    public void placeBet(int amount) {
        if (amount <= totalCash) {
            this.bet = amount;
            totalCash -= amount;
        }
    }
}
