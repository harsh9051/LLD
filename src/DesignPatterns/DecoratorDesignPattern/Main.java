package DesignPatterns.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {

        Car car = new SeatCover(new Perfume(new Baleno()));
        System.out.println(car.cost());
    }
}
