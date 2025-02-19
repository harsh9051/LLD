package RealWorldProblems.MeetingScheduler.ObserverDesignPattern;

public class EmailNotification extends NotificationService{
    @Override
    public void notify(String message) {
        for(Observer ob : observers){
            ob.update(message);
        }
    }
}
