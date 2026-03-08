package RealWorldProblems.BookMovieSystem;


import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private List<Booking> bookings = new ArrayList<>();

    public Customer(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public void createBooking(Booking booking){
        String status = booking.createBooking();
        if(status.equals("Booking successful."))bookings.add(booking);

    }

}
