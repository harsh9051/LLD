package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public class Remote2 implements RemoteImplementation{
    @Override
    public void remoteProcess() {
        System.out.println("Has Temperature Up and Down");
        System.out.println("Has Swing Button");
    }
}
