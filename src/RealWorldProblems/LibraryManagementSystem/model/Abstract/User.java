package RealWorldProblems.LibraryManagementSystem.model.Abstract;

import RealWorldProblems.LibraryManagementSystem.Enum.AccountStatus;
import RealWorldProblems.LibraryManagementSystem.model.LibraryCard;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class User {

    private AtomicInteger atomicInteger = new AtomicInteger(1000);
    private int id;
    private String password;
    private AccountStatus status;
    private Person person;
    private LibraryCard libraryCard;

    public User( String id, String password, AccountStatus status, Person person) {
        this.id = atomicInteger.incrementAndGet();
        this.password = password;
        this.status = status;
        this.person = person;
        this.libraryCard = LibraryCard.getInstance();
    }

    public int getId() {
        return id;
    }

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }
}
