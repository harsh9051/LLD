package RealWorldProblems.ParkingSpotSystem.dto.Decorator;

import RealWorldProblems.ParkingSpotSystem.dto.parkingspot.ParkingSpot;

public class Wash extends SpotDecorator{
    public Wash(Integer floor, Integer amount, ParkingSpot parkingSpot) {
        super(floor, amount, parkingSpot);
    }

    @Override
    public int cost(int parkinghours) {
        return parkingSpot.cost(parkinghours) + 20;
    }
}
