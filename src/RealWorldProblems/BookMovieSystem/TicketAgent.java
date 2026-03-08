package RealWorldProblems.BookMovieSystem;

import java.util.List;

public class TicketAgent extends Person{

    public TicketAgent(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public void createBooking(Booking booking){
        String status = booking.createBooking();
        System.out.println(status);
    }

}
