package Rides;

public class TeaCup extends Ride{

    public TeaCup(String name, double price, int minHeight) {
        super(name, price, minHeight);
    }

    public String ride(){
        return "TeaCup Ride";
    }

}
