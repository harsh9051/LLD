package RealWorldProblems.BookMovieSystem;

public class Gold extends Seat{
    public Gold(int seatNo) {
        super(seatNo);
    }

    @Override
    public int getRate() {
        return 200;
    }
}
