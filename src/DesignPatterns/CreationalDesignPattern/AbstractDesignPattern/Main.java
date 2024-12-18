package DesignPatterns.CreationalDesignPattern.AbstractDesignPattern;

public class Main {
    public static void main(String[] args) {

        String name = "Hyundai";
        VehicleFactory factory = IVehicleFactory.getFactory(name);
        factory.createCar().carBrand();
        factory.createBike().bikeName();

    }
}
