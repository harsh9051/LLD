package RealWorldProblems.MeetingScheduler;

import RealWorldProblems.MeetingScheduler.ObserverDesignPattern.NotificationService;

import java.time.LocalDateTime;
import java.util.List;

public class MeetingScheduler {

    private User user;
    private Calender calender;
    private List<MeetingRoom> meetingRooms;
    private NotificationService notificationService;

    public MeetingScheduler(User user, Calender calender, List<MeetingRoom> meetingRooms, NotificationService notificationService) {
        this.user = user;
        this.calender = calender;
        this.meetingRooms = meetingRooms;
        this.notificationService = notificationService;
    }


    public boolean bookRoom(List<User> users, MeetingRoom room, LocalDateTime startTime, LocalDateTime endTime, String subject){
        if(!room.isAvailable())return false;
        Interval interval = new Interval(startTime, endTime);
        Meeting meeting = new Meeting(users, room, interval, subject);
        calender.addMeeting(meeting);
        room.bookRoom(interval);
        room.setAvailable(Boolean.FALSE);

        for(User user1 : users)
            notificationService.addObservers(user1);

        notificationService.notify(subject);
        return true;
    }
}
