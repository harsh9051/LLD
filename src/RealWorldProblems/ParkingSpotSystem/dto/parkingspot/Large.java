package RealWorldProblems.ParkingSpotSystem.dto.parkingspot;

public class Large extends ParkingSpot{
    public Large(Integer floor, Integer amount) {
        super(floor, amount);
    }

    @Override
    public int cost(int parkinghours) {
        return parkinghours * getAmount();
    }
}
