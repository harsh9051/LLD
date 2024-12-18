package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public class Hitachi extends AirConditioner{
    public Hitachi(RemoteImplementation remoteImplementation) {
        super(remoteImplementation);
    }

    @Override
    public void controlAC() {
        remoteImplementation.remoteProcess();
    }
}
