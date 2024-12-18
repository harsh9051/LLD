package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

public abstract class AddOnsDecorator extends Car{

    public Car car;

    public AddOnsDecorator(Car car) {
        this.car = car;
    }
}
