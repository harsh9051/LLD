package RealWorldProblems.ParkingSpotSystem.dto.parkingspot;

public class Mini extends ParkingSpot{
    public Mini(Integer floor, Integer amount) {
        super(floor, amount);
    }

    @Override
    public int cost(int parkinghours) {
        return parkinghours * getAmount();
    }
}
