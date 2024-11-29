package ISP;

public class Square implements TwoDimensionalShape{
    private double raduis;

    public Square(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public double area() {
        return this.raduis*this.raduis;
    }

    @Override
    public void display() {
        System.out.println("Area of the Square is :- "+ area());
    }
}
