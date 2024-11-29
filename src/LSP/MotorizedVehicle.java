package LSP;

public abstract class MotorizedVehicle extends Vehicle{

    public MotorizedVehicle(String name, int number) {
        super(name, number);
    }

    public abstract void startEngine();
}
