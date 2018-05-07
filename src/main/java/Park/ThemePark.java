package Park;

import Person.Person;
import Rides.IRide;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IRide> rides;

    public ThemePark(String name) {
        this.name = name;
        this.rides = new ArrayList<>();
    }

    public void addRide(IRide ride){
        this.rides.add(ride);
    }

    public String goOnRide(IRide ride, Person person){
        return ride.ride(person);
    }

}
