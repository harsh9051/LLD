package RealWorldProblems.ParkingSpotSystem.parkingStrategy;

import RealWorldProblems.ParkingSpotSystem.dto.parkingspot.ParkingSpot;
import RealWorldProblems.ParkingSpotSystem.enums.ParkingSpotEnum;

public interface Strategy {

    ParkingSpot findParkingSpot(ParkingSpotEnum parkingSpotEnum);
}
