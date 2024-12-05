package RealWorldProblems.ParkingSpotSystem;

import RealWorldProblems.ParkingSpotSystem.dto.ParkingLot;
import RealWorldProblems.ParkingSpotSystem.dto.ParkingTicket;
import RealWorldProblems.ParkingSpotSystem.dto.parkingspot.ParkingSpot;
import RealWorldProblems.ParkingSpotSystem.dto.vehicle.Car;
import RealWorldProblems.ParkingSpotSystem.dto.vehicle.Vehicle;
import RealWorldProblems.ParkingSpotSystem.enums.ParkingSpotEnum;
import RealWorldProblems.ParkingSpotSystem.interfaces.IParkingService;
import RealWorldProblems.ParkingSpotSystem.interfaces.IParkingSpotService;
import RealWorldProblems.ParkingSpotSystem.parkingStrategy.FarthestParkingSpot;
import RealWorldProblems.ParkingSpotSystem.services.ParkingServiceImpl;
import RealWorldProblems.ParkingSpotSystem.services.ParkingSpotServiceImpl;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        IParkingSpotService parkingSpotService = new ParkingSpotServiceImpl();

        ParkingSpot p1 = parkingSpotService.create(ParkingSpotEnum.LARGE, 0, 10);
        ParkingSpot p2 = parkingSpotService.create(ParkingSpotEnum.LARGE, 0, 10);

        ParkingSpot p3 = parkingSpotService.create(ParkingSpotEnum.MINI, 0, 5);
        ParkingSpot p4 = parkingSpotService.create(ParkingSpotEnum.MINI, 0, 5);

        ParkingSpot p5 = parkingSpotService.create(ParkingSpotEnum.COMPACT, 0, 2);
        ParkingSpot p6 = parkingSpotService.create(ParkingSpotEnum.COMPACT, 0, 2);

        Vehicle v1 = new Car();
        Vehicle v2 = new Car();
        Vehicle v3 = new Car();

        IParkingService iParkingService = new ParkingServiceImpl(new FarthestParkingSpot());
        ParkingTicket ticket1 = iParkingService.entry(v1);

        System.out.println("Parking ticket : "+ ticket1.getId());

        int cost = iParkingService.exit(ticket1, v1);

        System.out.println("Cost : "+ cost);

//        ParkingTicket ticket2 = iParkingService.entry(v2);
//        System.out.println("Parking ticket : "+ ticket2.getId());
//
//        //Exit vehicle v2
//        int cost = iParkingService.exit(ticket2, v2);
//        System.out.println("Amount : "+ cost);

//        System.out.println(parkingLot.getDisplayBoard().getFreeOccupiedSpots().get(ParkingSpotEnum.COMPACT));

    }
}
