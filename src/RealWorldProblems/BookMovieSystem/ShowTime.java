package RealWorldProblems.BookMovieSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ShowTime {

    public final AtomicInteger x = new AtomicInteger(0);
    private int startTime;
    private int showID;
    private int duration;
    private List<Seat> seats = new ArrayList<>();

    public ShowTime(int duration, int startTime) {
        this.showID = x.getAndIncrement();
        this.startTime = startTime;
        this.duration = duration;
        int number = 1;
        for(int i = 0; i < 10; i++){
            this.seats.add(new Gold(number++));
        }

        for(int i = 0; i < 20; i++){
            this.seats.add(new Silver(number++));
        }
    }

    public List<Seat> showAvailableSeats(){
        List<Seat> available = new ArrayList<>();
        for(Seat s : this.seats){
            if(s.isAvailable())available.add(s);
        }

        return available;
    }

    public int getStartTime() {
        return startTime;
    }
}
