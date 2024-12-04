package RealWorldProblems.ParkingSpotSystem.services;

import RealWorldProblems.ParkingSpotSystem.dto.DisplayBoard;
import RealWorldProblems.ParkingSpotSystem.enums.ParkingSpotEnum;
import RealWorldProblems.ParkingSpotSystem.interfaces.IDisplayService;

public class DisplayServiceImpl implements IDisplayService {
    @Override
    public void update(ParkingSpotEnum parkingSpotEnum, int change) {
        int currentCount = DisplayBoard.getInstance().getFreeOccupiedSpots().get(parkingSpotEnum);
        int newCount = currentCount + change;
        DisplayBoard.getInstance().getFreeOccupiedSpots().replace(parkingSpotEnum, newCount);
    }
}
