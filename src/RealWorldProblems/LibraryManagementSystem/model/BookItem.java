package RealWorldProblems.LibraryManagementSystem.model;

import RealWorldProblems.LibraryManagementSystem.Enum.BookFormat;
import RealWorldProblems.LibraryManagementSystem.Enum.BookStatus;
import RealWorldProblems.LibraryManagementSystem.model.Abstract.Book;

import java.time.LocalDate;
import java.util.Date;

public class BookItem extends Book {

    private boolean isReference;
    private boolean borrowed;
    private LocalDate dueDate;
    private double price;
    private BookStatus status;
    private Date dateOfPurchase;
    private Rack placedAt;

    public BookItem(String ISBN, String title, String subject, int numberOfPages, BookFormat format, Author author, String publisher, BookStatus status, boolean borrowed, Rack placedAt) {
        super(ISBN, title, subject, numberOfPages, format, author, publisher);
        this.status = BookStatus.AVAILABLE;
        this.borrowed = false;
        this.placedAt = placedAt;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public BookStatus getStatus() {
        return status;
    }

    public boolean checkout(int memeberId){
        if(borrowed || status != BookStatus.AVAILABLE){
            System.out.println("Book is Not Available");
            return false;
        }
        this.borrowed = true;
        this.dueDate = LocalDate.now().plusDays(15);
        this.status = BookStatus.BORROWED;
        return true;
    }
}
