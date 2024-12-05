package RealWorldProblems.ParkingSpotSystem.dto.Decorator;

import RealWorldProblems.ParkingSpotSystem.dto.parkingspot.ParkingSpot;

public abstract class SpotDecorator extends ParkingSpot {
    ParkingSpot parkingSpot;

    public SpotDecorator(Integer floor, Integer amount, ParkingSpot parkingSpot) {
        super(floor, amount);
        this.parkingSpot = parkingSpot;
    }
}
