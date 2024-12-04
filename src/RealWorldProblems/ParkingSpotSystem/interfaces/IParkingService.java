package RealWorldProblems.ParkingSpotSystem.interfaces;

import RealWorldProblems.ParkingSpotSystem.dto.ParkingTicket;
import RealWorldProblems.ParkingSpotSystem.dto.vehicle.Vehicle;

public interface IParkingService {

    ParkingTicket entry(Vehicle vehicle);
    int exit(ParkingTicket parkingTicket, Vehicle vehicle);

}
