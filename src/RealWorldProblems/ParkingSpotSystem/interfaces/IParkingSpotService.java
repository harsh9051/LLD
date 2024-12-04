package RealWorldProblems.ParkingSpotSystem.interfaces;

import RealWorldProblems.ParkingSpotSystem.dto.parkingspot.ParkingSpot;
import RealWorldProblems.ParkingSpotSystem.enums.ParkingSpotEnum;

public interface IParkingSpotService {

    ParkingSpot create(ParkingSpotEnum parkingSpotEnum, Integer floor, Integer amount);
}
