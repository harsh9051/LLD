package RealWorldProblems.ParkingSpotSystem.dto;

import RealWorldProblems.ParkingSpotSystem.enums.ParkingSpotEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/*
    In this Class we have used Singleton Design Pattern.
    Since on single DisplayBoard we have to display the freespots.
 */
public class DisplayBoard {

    private static DisplayBoard displayBoard = null;
    private Map<ParkingSpotEnum, Integer> freeOccupiedSpots;

    private DisplayBoard() {
        this.freeOccupiedSpots = new HashMap<>();
        this.freeOccupiedSpots.put(ParkingSpotEnum.MINI, 0);
        this.freeOccupiedSpots.put(ParkingSpotEnum.LARGE, 0);
        this.freeOccupiedSpots.put(ParkingSpotEnum.COMPACT, 0);
    }

    public static DisplayBoard getInstance(){
        if(displayBoard == null){
            displayBoard = new DisplayBoard();
        }
        return displayBoard;
    }

    public Map<ParkingSpotEnum, Integer> getFreeOccupiedSpots() {
        return freeOccupiedSpots;
    }
}
