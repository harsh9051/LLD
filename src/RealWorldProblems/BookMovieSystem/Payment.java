package RealWorldProblems.BookMovieSystem;

import java.util.Date;

public abstract class Payment {

    private double amount;
    private boolean isPaid;
    private Date timestamp;

    public abstract boolean makePayment(int amount);
}
