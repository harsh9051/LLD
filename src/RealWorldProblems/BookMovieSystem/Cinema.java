package RealWorldProblems.BookMovieSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Cinema {

    public final AtomicInteger x = new AtomicInteger(1);
    private int cinemaNo;
    private List<Hall> halls = new ArrayList<>();
    private City city;

    public Cinema() {
        this.cinemaNo = x.getAndIncrement();
    }

    public List<Hall> getHalls(){
        return this.halls;
    }

    public void addHall(Hall h){
        this.halls.add(h);
    }
}
