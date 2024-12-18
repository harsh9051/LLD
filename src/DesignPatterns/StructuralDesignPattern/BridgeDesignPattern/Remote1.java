package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public class Remote1 implements RemoteImplementation{
    @Override
    public void remoteProcess() {
        System.out.println("Has Temperature Up and Down");
    }
}
