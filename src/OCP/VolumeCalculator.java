package OCP;

public class VolumeCalculator {
    private double totalSum;

    public void sumVolume(Shape shape){
        totalSum += shape.volume();
    }

    public double getTotalSum(){
        return this.totalSum;
    }
}
