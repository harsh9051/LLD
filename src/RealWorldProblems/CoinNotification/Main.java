package RealWorldProblems.CoinNotification;

public class Main {
    public static void main(String[] args) {

        NotificationService notificationService = new EmailNotification();
        User u1 = new User(1, "hast");
        Coin coin = new Coin("BitCoin", notificationService);
        coin.addUsers(u1);
        coin.notification();

    }
}
