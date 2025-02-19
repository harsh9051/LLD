package RealWorldProblems.MeetingScheduler;

import RealWorldProblems.MeetingScheduler.ObserverDesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class User implements Observer{

    private static final AtomicInteger x = new AtomicInteger(0);
    private int id;
    private String name;
    private MeetingScheduler scheduler;
    private List<Meeting> meetings = new ArrayList<>();

    public User(String name) {
        this.id = x.getAndIncrement();
        this.name = name;
    }

    public void respondInvitation(Meeting meeting) {
        System.out.println(name + " accepted invitation for meeting: " + meeting.getSubject());
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for Meeting "+ this.name + " message : "+message);
    }
}
