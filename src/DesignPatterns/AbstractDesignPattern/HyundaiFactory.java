package DesignPatterns.AbstractDesignPattern;

public class HyundaiFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new HyundaiCar();
    }

    @Override
    public Bike createBike() {
        return new HyundaiBike();
    }
}
