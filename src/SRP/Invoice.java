package SRP;

public class Invoice {
    private Book book;
    private int quantity;
    private double price;

    public Invoice(Book book, int quantity, double price) {
        this.book = book;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculatorTotal(){
        return quantity * price;
    }

    public Book getBook(){
        return this.book;
    }
}
