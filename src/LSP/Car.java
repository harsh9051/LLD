package LSP;

public class Car extends MotorizedVehicle{
    public Car(String name, int number) {
        super(name, number);
    }

    @Override
    public void startEngine() {
        System.out.println("Car has started.");
        printCarDetails();
    }

    private void printCarDetails(){
        System.out.println("Car Name:- "+this.getName());
        System.out.println("Car Number:- "+this.getNumber());
    }
}
