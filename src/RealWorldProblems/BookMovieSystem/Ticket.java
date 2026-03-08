package RealWorldProblems.BookMovieSystem;

import java.util.concurrent.atomic.AtomicInteger;

public class Ticket {

    public final AtomicInteger x = new AtomicInteger(1);
    private int ticketNo;
    private Seat seat;
    private Movie movie;
    private ShowTime showTime;

    public AtomicInteger getX() {
        return x;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public ShowTime getShowTime() {
        return showTime;
    }

    public void setShowTime(ShowTime showTime) {
        this.showTime = showTime;
    }
}
