package RealWorldProblems.MeetingScheduler;

import RealWorldProblems.MeetingScheduler.ObserverDesignPattern.EmailNotification;
import RealWorldProblems.MeetingScheduler.ObserverDesignPattern.NotificationService;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        NotificationService notificationService = new EmailNotification();
        Calender calender = new Calender();
        MeetingRoom room = new MeetingRoom(5);

        User organiser = new User("Harsh");

        User alice = new User("Alice");
        User bob = new User("Bob");
        List<User> participants = List.of(alice, bob);

        MeetingScheduler scheduler = new MeetingScheduler(organiser, calender, List.of(room), notificationService);
        if(scheduler.bookRoom(participants, room, LocalDateTime.now(), LocalDateTime.now().plusHours(1), "Project Discussion")){
            System.out.println("Meeting is Scheduled Succesfully.....");
        }else{
            System.out.println("Room is already booked");
        }

    }
}
