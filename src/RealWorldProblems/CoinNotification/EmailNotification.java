package RealWorldProblems.CoinNotification;

public class EmailNotification extends NotificationService{
    @Override
    public void notification() {
        for(Obsrver obsrver : obsrvers)
            obsrver.notification();
    }
}
