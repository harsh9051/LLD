package OCP;

public class Cuboid implements Shape{
    private double radius;

    public Cuboid(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (3.14 * radius*radius*4)/3;
    }
}
