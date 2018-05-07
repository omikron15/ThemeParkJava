import Rides.TeaCup;
import org.junit.Before;
import org.junit.Test;
import Person.Person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TeaCupTest {

    TeaCup teaCup;
    Person person1;

    @Before
    public void before(){
        teaCup = new TeaCup("TeaCup Ride 1", 5.00, 130);
        person1 = new Person("Person 1", 20, 150, 50.50);
    }

    @Test
    public void getName() {
        assertEquals("TeaCup Ride 1", teaCup.getName());
    }

    @Test
    public void getPrice() {
        assertEquals(5.00, teaCup.getPrice(), 0.10);
    }

    @Test
    public void getHeight() {
        assertEquals(130, teaCup.getMinHeight());
    }

    @Test
    public void setName() {
        teaCup.setName("TeaCup Ride 2");
        assertEquals("TeaCup Ride 2", teaCup.getName());
    }

    @Test
    public void setPrice() {
        teaCup.setPrice(7.50);
        assertEquals(7.50, teaCup.getPrice(), 0.10);
    }

    @Test
    public void setMinHeight(){
        teaCup.setMinHeight(140);
        assertEquals(140, teaCup.getMinHeight());
    }

    @Test
    public void ride(){
        assertEquals("Person 1 is on the TeaCup ride", teaCup.ride(person1));
    }
}
