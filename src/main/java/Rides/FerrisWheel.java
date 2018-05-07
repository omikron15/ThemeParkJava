package Rides;
import Person.Person;

public class FerrisWheel extends Ride {

    public FerrisWheel(String name, double price, int minHeight) {
        super(name, price, minHeight);
    }

    public String ride(Person person){
        if (hasEnoughMoney(person) & isTallEnough(person)) {
            return person.getName() + " is on the FerrisWheel ride";
        }
        return null;
    }
}
