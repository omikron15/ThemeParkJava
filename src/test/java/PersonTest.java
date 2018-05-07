import org.junit.Before;
import org.junit.Test;

import Person.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person1;
    Person person2;
    Person person3;

    @Before
    public void before(){
        person1 = new Person("Person 1", 20, 150, 50.50);
        person2 = new Person("Person 2", 10, 145, 75.50);
        person3 = new Person("Person 3", 25, 135, 2.50);
    }

    @Test
    public void getName() {
        assertEquals("Person 1", person1.getName());
    }

    @Test
    public void getAge() {
        assertEquals(20, person1.getAge());
    }

    @Test
    public void getHeight() {
        assertEquals(150, person1.getHeight());
    }

    @Test
    public void getMoney() {
        assertEquals(50.50, person1.getMoney(), 0.5);
    }

    @Test
    public void setMoney(){
        person1.setMoney(100.50);
        assertEquals(100.50, person1.getMoney(), 0.10);
    }


}
