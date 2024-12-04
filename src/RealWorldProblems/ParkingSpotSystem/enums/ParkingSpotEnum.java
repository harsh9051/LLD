package RealWorldProblems.ParkingSpotSystem.enums;

import RealWorldProblems.ParkingSpotSystem.dto.parkingspot.Compact;
import RealWorldProblems.ParkingSpotSystem.dto.parkingspot.Large;
import RealWorldProblems.ParkingSpotSystem.dto.parkingspot.Mini;

public enum ParkingSpotEnum {

    COMPACT(Compact.class),
    MINI(Mini.class),
    LARGE(Large.class);

    private Class parkingSpot;

    ParkingSpotEnum(Class parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Class getParkingSpot(){
        return this.parkingSpot;
    }
}
