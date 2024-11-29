package ISP;

public class Cube implements ThreeDimensionalShape{

    private double radius;

    public Cube(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (3.14*this.radius*this.radius)/3;
    }

    @Override
    public void display() {
        System.out.println("Area of Cube :- "+ volume());
    }
}
