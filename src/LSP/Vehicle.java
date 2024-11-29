package LSP;

public class Vehicle {

    private String name;
    private int number;

    public Vehicle(String name){
        this.name = name;
    }

    public Vehicle(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
