package LSP;

public class Bicycle extends MovingVehicle{
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void startMoving() {
        System.out.println("Bicycle has started moving");
        printBicycleDetails();
    }

    private void printBicycleDetails(){
        System.out.println("Car Name:- "+this.getName());
    }
}
