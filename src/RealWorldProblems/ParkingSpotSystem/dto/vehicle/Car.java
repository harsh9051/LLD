package RealWorldProblems.ParkingSpotSystem.dto.vehicle;

import RealWorldProblems.ParkingSpotSystem.enums.ParkingSpotEnum;

public class Car extends Vehicle{
    public Car() {
        super(ParkingSpotEnum.COMPACT);
    }
}
