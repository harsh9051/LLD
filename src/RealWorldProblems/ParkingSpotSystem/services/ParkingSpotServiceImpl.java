package RealWorldProblems.ParkingSpotSystem.services;

import RealWorldProblems.ParkingSpotSystem.dto.ParkingLot;
import RealWorldProblems.ParkingSpotSystem.dto.parkingspot.ParkingSpot;
import RealWorldProblems.ParkingSpotSystem.enums.ParkingSpotEnum;
import RealWorldProblems.ParkingSpotSystem.interfaces.IDisplayService;
import RealWorldProblems.ParkingSpotSystem.interfaces.IParkingSpotService;

import java.lang.reflect.InvocationTargetException;

public class ParkingSpotServiceImpl implements IParkingSpotService {

    private IDisplayService iDisplayService = new DisplayServiceImpl();

    @Override
    public ParkingSpot create(ParkingSpotEnum parkingSpotEnum, Integer floor, Integer amount) {

        try {
            ParkingSpot parkingSpot = (ParkingSpot) parkingSpotEnum
                                                            .getParkingSpot()
                                                            .getConstructor(Integer.class, Integer.class)
                                                            .newInstance(floor, amount);
            ParkingLot.getInstance().getFreeSpots().get(parkingSpotEnum).add(parkingSpot);
            iDisplayService.update(parkingSpotEnum, 1);
            return parkingSpot;

        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
