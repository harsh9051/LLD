package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public class Carrier extends AirConditioner{
    public Carrier(RemoteImplementation remoteImplementation) {
        super(remoteImplementation);
    }

    @Override
    public void controlAC() {
        remoteImplementation.remoteProcess();
    }
}
