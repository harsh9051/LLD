package RealWorldProblems.BookMovieSystem;


import RealWorldProblems.BookMovieSystem.Notification.NotificationService;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Booking {

    public final AtomicInteger x = new AtomicInteger(1);
    private int bookingId;
    private int amount;
    private int totalSeats;
    private Payment payment;
    private Movie movie;
    private ShowTime showTime;
    private List<Seat> seats;

    public Booking(ShowTime showTime, Movie movie, List<Seat> seats){
        this.amount = 0;
        this.showTime = showTime;
        this.movie = movie;
        this.seats = seats;
    }


    public String createBooking(){
        List<Seat> availableSeats = showTime.showAvailableSeats();
        if(availableSeats.size() < seats.size())return "Expecting greater number of seats to be booked which is not possible.";

        for(Seat s1 : seats){
            if(availableSeats.contains(s1)){
                s1.setAvailable(Boolean.FALSE);
                amount += s1.getRate();
            }
        }

        boolean status = payment.makePayment(amount);
        if(!status) return "Booking Failed.";
        bookingId = x.getAndIncrement();
        System.out.println(bookingId + " booking is succesfully.");
        return "Booking successful.";

    }


}
