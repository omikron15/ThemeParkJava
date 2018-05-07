package Rides;
import Person.Person;

public class TeaCup extends Ride{

    public TeaCup(String name, double price, int minHeight) {
        super(name, price, minHeight);
    }

    public String ride(Person person){
        if (hasEnoughMoney(person) & isTallEnough(person)) {
            return person.getName() + " is on the TeaCup ride";
        }
        return null;
    }

}
