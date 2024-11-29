package ISP;

public class Rectangle implements TwoDimensionalShape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return this.length*this.breadth;
    }

    @Override
    public void display() {
        System.out.println("Area of the Rectangle is :- "+ area());
    }
}
