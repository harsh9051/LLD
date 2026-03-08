package RealWorldProblems.CoinNotification;


import java.util.ArrayList;
import java.util.List;

public abstract class NotificationService {
    public List<Obsrver> obsrvers = new ArrayList<>();

    public void addObservers(Obsrver observer){
        this.obsrvers.add(observer);
    }

    public void removerObservers(Obsrver obsrver){
        this.removerObservers(obsrver);
    }

    public abstract void notification();
}
