package RealWorldProblems.LibraryManagementSystem.model;

import RealWorldProblems.LibraryManagementSystem.Enum.AccountStatus;
import RealWorldProblems.LibraryManagementSystem.Enum.BookStatus;
import RealWorldProblems.LibraryManagementSystem.model.Abstract.Person;
import RealWorldProblems.LibraryManagementSystem.model.Abstract.User;

import java.time.LocalDate;
import java.util.Date;

public class Member extends User {

    private int totalBooksCheckout;
    private LocalDate dateOfMemberShip;

    public Member(String id, String password, AccountStatus status, Person person) {
        super(id, password, status, person);
        this.totalBooksCheckout = 0;
        this.dateOfMemberShip = LocalDate.now();
    }

    public int getTotalBooksCheckout() {
        return totalBooksCheckout;
    }

    public void incrementTotalBooksCheckout(){
        this.totalBooksCheckout++;
    }

    public boolean checkoutBookItem(BookItem bookItem){
        if(!this.getLibraryCard().isActive()){
            System.out.println("The member library card is not active");
            return false;
        }

        if(this.totalBooksCheckout >= 10){
            System.out.println("The Member with id : "+this.getId()+" has reached max limit");
            return false;
        }
        if(bookItem.checkout(this.getId())){
            incrementTotalBooksCheckout();
            System.out.println("Book checked out successfully.");
            return true;
        }
        return false;
    }

    public void returnBookItem(BookItem bookItem) {
        bookItem.setStatus(BookStatus.AVAILABLE);
        bookItem.setBorrowed(false);
        this.totalBooksCheckout--;
        System.out.println("Book returned successfully.");
    }
}
