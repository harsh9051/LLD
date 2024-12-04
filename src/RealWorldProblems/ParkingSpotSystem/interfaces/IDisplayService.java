package RealWorldProblems.ParkingSpotSystem.interfaces;

import RealWorldProblems.ParkingSpotSystem.enums.ParkingSpotEnum;

public interface IDisplayService {

    void update(ParkingSpotEnum parkingSpotEnum, int change);
}
