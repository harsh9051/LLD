package RealWorldProblems.BookMovieSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Hall {

    public final AtomicInteger x = new AtomicInteger(1);
    private int hallNo;
    private List<ShowTime> showTimes;

    public Hall() {
        hallNo = x.getAndIncrement();
        showTimes = new ArrayList<>();
    }

    public void setShowTimes(ShowTime showTime){
        this.showTimes.add(showTime);
    }

    public List<ShowTime> availableShowTime(){
        List<ShowTime> availableShow = new ArrayList<>();
        for(ShowTime s : this.showTimes){
            if(s.getStartTime() > 1)
                availableShow.add(s);
        }
        return availableShow;
    }
}
