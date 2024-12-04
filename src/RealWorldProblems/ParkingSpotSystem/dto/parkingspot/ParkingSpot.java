package RealWorldProblems.ParkingSpotSystem.dto.parkingspot;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class ParkingSpot {

    private static final AtomicInteger x = new AtomicInteger(0);
    private int id;
    private boolean free;
    private Integer floor;
    private Integer amount;

    public ParkingSpot(Integer floor, Integer amount) {
        this.floor = floor;
        this.amount = amount;
        this.free = true;
        this.id = x.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public abstract int cost(int parkinghours);
}
