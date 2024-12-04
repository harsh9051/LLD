package RealWorldProblems.ParkingSpotSystem.dto;

import RealWorldProblems.ParkingSpotSystem.dto.parkingspot.ParkingSpot;
import RealWorldProblems.ParkingSpotSystem.enums.ParkingSpotEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    This is also a Singleton Class since we have to make changes in Single Parking Lot Class.
 */

public class ParkingLot {
    private String name;
    private List<Entrance> entrances;
    private List<Exit> exits;
    private DisplayBoard displayBoard;
    private Map<ParkingSpotEnum, List<ParkingSpot>> freeSpots;
    private Map<ParkingSpotEnum, List<ParkingSpot>> occupiedSpots;

    private static ParkingLot parkingLot = null;

    private ParkingLot(String name) {
        this.name = name;
        this.entrances = new ArrayList<>();
        this.exits = new ArrayList<>();
        this.displayBoard = DisplayBoard.getInstance();
        this.freeSpots = new HashMap<>();
        this.occupiedSpots = new HashMap<>();

        this.freeSpots.put(ParkingSpotEnum.MINI, new ArrayList<>());
        this.freeSpots.put(ParkingSpotEnum.LARGE, new ArrayList<>());
        this.freeSpots.put(ParkingSpotEnum.COMPACT, new ArrayList<>());

        this.occupiedSpots.put(ParkingSpotEnum.MINI, new ArrayList<>());
        this.occupiedSpots.put(ParkingSpotEnum.LARGE, new ArrayList<>());
        this.occupiedSpots.put(ParkingSpotEnum.COMPACT, new ArrayList<>());
    }

    public static ParkingLot getInstance(){
        if(parkingLot == null){
            parkingLot = new ParkingLot("abc");
        }
        return parkingLot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Entrance> getEntrances() {
        return entrances;
    }

    public void setEntrances(List<Entrance> entrances) {
        this.entrances = entrances;
    }

    public List<Exit> getExits() {
        return exits;
    }

    public void setExits(List<Exit> exits) {
        this.exits = exits;
    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }

    public void setDisplayBoard(DisplayBoard displayBoard) {
        this.displayBoard = displayBoard;
    }

    public Map<ParkingSpotEnum, List<ParkingSpot>> getFreeSpots() {
        return freeSpots;
    }

    public void setFreeSpots(Map<ParkingSpotEnum, List<ParkingSpot>> freeSpots) {
        this.freeSpots = freeSpots;
    }

    public Map<ParkingSpotEnum, List<ParkingSpot>> getOccupiedSpots() {
        return occupiedSpots;
    }

    public void setOccupiedSpots(Map<ParkingSpotEnum, List<ParkingSpot>> occupiedSpots) {
        this.occupiedSpots = occupiedSpots;
    }
}
