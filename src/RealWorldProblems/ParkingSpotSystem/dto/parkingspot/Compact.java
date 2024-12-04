package RealWorldProblems.ParkingSpotSystem.dto.parkingspot;

public class Compact extends ParkingSpot{
    public Compact(Integer floor, Integer amount) {
        super(floor, amount);
    }

    @Override
    public int cost(int parkinghours) {
        return parkinghours * getAmount();
    }
}
