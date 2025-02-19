package RealWorldProblems.MeetingScheduler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MeetingRoom {

    private static final AtomicInteger x = new AtomicInteger(0);
    private int id;
    private int capacity;
    private List<Interval> bookedInterval;
    private boolean isAvailable;

    public MeetingRoom(int capacity) {
        this.capacity = capacity;
        this.isAvailable = Boolean.TRUE;
        this.bookedInterval = new ArrayList<>();
        this.id = x.getAndIncrement();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Interval> getBookedInterval() {
        return bookedInterval;
    }

    public void setBookedInterval(List<Interval> bookedInterval) {
        this.bookedInterval = bookedInterval;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void bookRoom(Interval interval){
        this.bookedInterval.add(interval);
    }
}
