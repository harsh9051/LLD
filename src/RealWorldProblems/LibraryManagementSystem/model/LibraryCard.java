package RealWorldProblems.LibraryManagementSystem.model;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class LibraryCard {

    private AtomicInteger atomicInteger = new AtomicInteger(101);
    private int id;
    private LocalDate issuedAt;
    private boolean isActive;

    public LibraryCard() {
        this.id = atomicInteger.incrementAndGet();
        this.issuedAt = LocalDate.now();
        setActive(true);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public static LibraryCard getInstance(){
        LibraryCard libraryCard = new LibraryCard();
        return libraryCard;
    }
}
