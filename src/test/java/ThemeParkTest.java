import Park.ThemePark;
import Person.Person;
import Rides.Dodgems;
import Rides.FerrisWheel;
import Rides.TeaCup;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PERSIST_STORE;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark1;
    Person person1;
    TeaCup teaCup;
    Dodgems dodgems;
    FerrisWheel ferrisWheel;

    @Before
    public void before(){
    themePark1 = new ThemePark("Park 1");
    dodgems = new Dodgems("Dodgems 1", 4.50, 140);
    ferrisWheel = new FerrisWheel("Ferris Wheel 1", 8.00, 135);
    teaCup = new TeaCup("TeaCup Ride 1", 5.00, 130);
    person1 = new Person("Person 1", 20, 150, 50.50);
    themePark1.addRide(dodgems);
    themePark1.addRide(ferrisWheel);
    themePark1.addRide(teaCup);

    }

    @Test
    public void canRide(){
        String result = themePark1.goOnRide(dodgems, person1);
        assertEquals("Person 1 is on the Dodgems ride",result);

    }

}
