package DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public class WindowsButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Window Button is Clicked");
    }
}
