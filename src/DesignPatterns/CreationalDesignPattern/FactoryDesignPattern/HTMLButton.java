package DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public class HTMLButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Html Button is clicked.");
    }
}
