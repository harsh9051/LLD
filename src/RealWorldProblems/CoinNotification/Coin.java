package RealWorldProblems.CoinNotification;

import java.util.ArrayList;
import java.util.List;

public class Coin {

    private int coinId;
    private String coinName;
    private NotificationService notificationService;
    private List<Obsrver> subscribed = new ArrayList<>();

    public Coin(String coinName, NotificationService notificationService){
        this.coinName = coinName;
        this.notificationService = notificationService;
    }

    public void addUsers(User u1){
        this.subscribed.add(u1);
    }

    public void notifyUser(User u1){
        if(this.subscribed.contains(u1)){
            this.notificationService.addObservers(u1);
        }
    }

    public void notification(){
        System.out.println("Created Notification " + this.coinName);
        for (Obsrver u1 : subscribed){
            if(this.notificationService.obsrvers.contains(u1)){
                u1.notification();
            }
        }
    }



}
