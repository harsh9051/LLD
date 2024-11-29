package LSP;

public abstract class MovingVehicle extends Vehicle{

    public MovingVehicle(String name) {
        super(name);
    }

    public abstract void startMoving();
}
