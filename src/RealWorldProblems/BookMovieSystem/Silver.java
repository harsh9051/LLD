package RealWorldProblems.BookMovieSystem;

public class Silver extends Seat{
    public Silver(int seatNo) {
        super(seatNo);
    }

    @Override
    public int getRate() {
        return 100;
    }
}
