package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

public class SeatCover extends AddOnsDecorator{
    public SeatCover(Car car) {
        super(car);
    }

    @Override
    public int cost() {
        return car.cost() + 10000;
    }
}
