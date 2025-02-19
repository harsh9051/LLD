package RealWorldProblems.MeetingScheduler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Meeting {

    private static final AtomicInteger x = new AtomicInteger(0);
    private int id;
    private List<User> participants;
    private MeetingRoom meetingRoom;
    private Interval interval;
    private String subject;
    private MeetingStatus meetingStatus;

    public Meeting(List<User> participants, MeetingRoom room, Interval interval, String subject) {
        this.id = x.getAndIncrement();
        this.participants = participants;
        this.meetingRoom = room;
        this.interval = interval;
        this.meetingStatus = MeetingStatus.SCHEDULED;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addParticipants(List<User> users){
        this.participants.addAll(users);
    }

    public void releaseRoom(){
        if(LocalDateTime.now().isAfter(interval.getEndTime())){
            meetingRoom.setAvailable(Boolean.TRUE);
            meetingStatus = MeetingStatus.COMPLETED;
        }
    }
}
