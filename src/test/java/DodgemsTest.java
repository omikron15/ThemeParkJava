import Rides.Dodgems;
import Rides.TeaCup;
import org.junit.Before;
import org.junit.Test;
import Person.Person;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Person person1;

    @Before
    public void before(){
        dodgems = new Dodgems("Dodgems 1", 4.50, 140);
        person1 = new Person("Person 1", 20, 150, 50.50);
    }

    @Test
    public void getName() {
        assertEquals("Dodgems 1", dodgems.getName());
    }

    @Test
    public void getPrice() {
        assertEquals(4.50, dodgems.getPrice(), 0.10);
    }

    @Test
    public void getHeight() {
        assertEquals(140, dodgems.getMinHeight());
    }

    @Test
    public void setName() {
        dodgems.setName("Dodgems 2");
        assertEquals("Dodgems 2", dodgems.getName());
    }

    @Test
    public void setPrice() {
        dodgems.setPrice(7.50);
        assertEquals(7.50, dodgems.getPrice(), 0.10);
    }

    @Test
    public void setMinHeight(){
        dodgems.setMinHeight(145);
        assertEquals(145, dodgems.getMinHeight());
    }

    @Test
    public void ride(){
        assertEquals("Person 1 is on the Dodgems ride", dodgems.ride(person1));
    }
}
