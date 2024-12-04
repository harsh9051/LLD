package DesignPatterns.AbstractDesignPattern;

public class HondaFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new HondaCar();
    }

    @Override
    public Bike createBike() {
        return new HondaBike();
    }
}
