package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public class Main {

    public static void main(String[] args) {

        AirConditioner airConditioner = new Hitachi(new Remote1());
        airConditioner.controlAC();
        //GoingForward i can change the remote and yet we do not have to change the AC.
        //Here we add remote 3 also that can exist independently without disturbing the Air Conditioner class.
        airConditioner = new Hitachi(new Remote2());
        airConditioner.controlAC();
    }
}
