package RealWorldProblems.ParkingSpotSystem.services;

import RealWorldProblems.ParkingSpotSystem.dto.ParkingLot;
import RealWorldProblems.ParkingSpotSystem.dto.ParkingTicket;
import RealWorldProblems.ParkingSpotSystem.dto.parkingspot.ParkingSpot;
import RealWorldProblems.ParkingSpotSystem.dto.vehicle.Vehicle;
import RealWorldProblems.ParkingSpotSystem.enums.ParkingSpotEnum;
import RealWorldProblems.ParkingSpotSystem.interfaces.IDisplayService;
import RealWorldProblems.ParkingSpotSystem.interfaces.IParkingService;
import RealWorldProblems.ParkingSpotSystem.parkingStrategy.Strategy;

import java.util.List;

public class ParkingServiceImpl implements IParkingService {

    Strategy parkingStrategy;
    ParkingLot parkingLot;
    IDisplayService iDisplayService;

    public ParkingServiceImpl(Strategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
        this.parkingLot = ParkingLot.getInstance();
        this.iDisplayService = new DisplayServiceImpl();
    }

    @Override
    public ParkingTicket entry(Vehicle vehicle) {
        ParkingSpotEnum parkingSpotEnum = vehicle.getParkingSpotEnum();
        List<ParkingSpot> freeSpots = parkingLot.getFreeSpots().get(parkingSpotEnum);
        List<ParkingSpot> occupiedSpots = parkingLot.getOccupiedSpots().get(parkingSpotEnum);
        try{
            ParkingSpot parkingSpot = parkingStrategy.findParkingSpot(parkingSpotEnum);
            if(parkingSpot.isFree()){
                synchronized (parkingSpot){
                    if(parkingSpot.isFree()){
                        parkingSpot.setFree(false);
                        freeSpots.remove(parkingSpot);
                        occupiedSpots.add(parkingSpot);
                        ParkingTicket parkingTicket = new ParkingTicket(vehicle, parkingSpot);
                        iDisplayService.update(parkingSpotEnum, -1);
                        return parkingTicket;
                    }
                }
                entry(vehicle);
            }
        } catch (Exception e) {
            throw new RuntimeException("Spot No Found Exception");
        }
        return null;
    }

    @Override
    public int exit(ParkingTicket parkingTicket, Vehicle vehicle) {
        if (parkingTicket.getVehicle().equals(vehicle)){
            ParkingSpot parkingSpot = parkingTicket.getParkingSpot();
            int amount = parkingSpot.cost(parkingTicket.getParkingHours());
            parkingSpot.setFree(true);
            parkingLot.getOccupiedSpots().get(vehicle.getParkingSpotEnum()).remove(parkingSpot);
            parkingLot.getFreeSpots().get(vehicle.getParkingSpotEnum()).add(parkingSpot);
            iDisplayService.update(vehicle.getParkingSpotEnum(), 1);
            return amount;
        }else{
            throw new RuntimeException("Invalid Ticket");
        }
    }
}
