package OCP;

public class Cone implements Shape{
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return (3.14 * radius*radius*height)/3;
    }
}
