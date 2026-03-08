package RealWorldProblems.BookMovieSystem;

public class CreditCard extends Payment{

    private int cardNo;
    private String name;
    private int cvv;
    private int mm;
    private int year;

    public CreditCard(int cardNo, String name, int cvv, int mm, int year) {
        this.cardNo = cardNo;
        this.name = name;
        this.cvv = cvv;
        this.mm = mm;
        this.year = year;
    }

    @Override
    public boolean makePayment(int amount) {
        System.out.println("Debited from the account.");
        return Boolean.TRUE;
    }
}
