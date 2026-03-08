package RealWorldProblems.BookMovieSystem;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Seat {

    private int seatNo;
    private boolean isAvailable;

    public Seat(int seatNo) {
        this.seatNo = seatNo;
        this.isAvailable = Boolean.TRUE;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract int getRate();
}
