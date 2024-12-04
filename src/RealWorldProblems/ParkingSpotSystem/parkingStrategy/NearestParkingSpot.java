package RealWorldProblems.ParkingSpotSystem.parkingStrategy;

import RealWorldProblems.ParkingSpotSystem.dto.ParkingLot;
import RealWorldProblems.ParkingSpotSystem.dto.parkingspot.ParkingSpot;
import RealWorldProblems.ParkingSpotSystem.enums.ParkingSpotEnum;

import java.util.List;

public class NearestParkingSpot implements Strategy{
    @Override
    public ParkingSpot findParkingSpot(ParkingSpotEnum parkingSpotEnum) {
        List<ParkingSpot> parkingSpotList = ParkingLot.getInstance().getFreeSpots().get(parkingSpotEnum);
        if(parkingSpotList.isEmpty())
            throw new RuntimeException("There is no free Spots");
        return parkingSpotList.getFirst();
    }
}
