package DesignPatterns.DecoratorDesignPattern;

public class Perfume extends AddOnsDecorator{
    public Perfume(Car car) {
        super(car);
    }

    @Override
    public int cost() {
        return car.cost() + 5000;
    }
}
