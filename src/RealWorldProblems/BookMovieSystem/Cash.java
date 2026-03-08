package RealWorldProblems.BookMovieSystem;

public class Cash extends Payment{
    @Override
    public boolean makePayment(int amount) {
        System.out.println("Cash collected.");
        return Boolean.TRUE;
    }
}
