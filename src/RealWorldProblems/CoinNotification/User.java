package RealWorldProblems.CoinNotification;


public class User implements Obsrver{

    private int userId;
    private String emailId;

    public User(int userId, String emailId) {
        this.userId = userId;
        this.emailId = emailId;
    }

    @Override
    public void notification() {
        System.out.println("Send Notification");
    }
}
