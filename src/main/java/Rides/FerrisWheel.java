package Rides;

public class FerrisWheel extends Ride {

    public FerrisWheel(String name, double price, int minHeight) {
        super(name, price, minHeight);
    }

    public String ride(){
        return "FerrisWheel ride";
    }
}
