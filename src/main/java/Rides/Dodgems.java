package Rides;
import Person.Person;

public class Dodgems extends Ride{

    public Dodgems(String name, double price, int minHeight) {
        super(name, price, minHeight);
    }

    public String ride(Person person){
        if (hasEnoughMoney(person) & isTallEnough(person)) {
            return person.getName() + " is on the Dodgems ride";
        }
        return null;
    }


}
