package DesignPatterns.CreationalDesignPattern.AbstractDesignPattern;

public class IVehicleFactory {

    public static VehicleFactory getFactory(String type){
        if(type.equalsIgnoreCase("hyundai"))return new HyundaiFactory();
        return new HondaFactory();
    }
}
