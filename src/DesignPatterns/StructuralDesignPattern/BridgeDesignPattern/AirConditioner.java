package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public abstract class AirConditioner {

    public RemoteImplementation remoteImplementation;

    public AirConditioner(RemoteImplementation remoteImplementation) {
        this.remoteImplementation = remoteImplementation;
    }

    public abstract void controlAC();
}
