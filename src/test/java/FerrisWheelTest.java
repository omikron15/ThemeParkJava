import Rides.FerrisWheel;
import Rides.TeaCup;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FerrisWheelTest {

    FerrisWheel ferrisWheel;

    @Before
    public void before(){
        ferrisWheel = new FerrisWheel("Ferris Wheel 1", 8.00, 135);
    }

    @Test
    public void getName() {
        assertEquals("Ferris Wheel 1", ferrisWheel.getName());
    }

    @Test
    public void getPrice() {
        assertEquals(8.00, ferrisWheel.getPrice(), 0.10);
    }

    @Test
    public void getHeight() {
        assertEquals(135, ferrisWheel.getMinHeight());
    }

    @Test
    public void setName() {
        ferrisWheel.setName("Ferris Wheel 2");
        assertEquals("Ferris Wheel 2", ferrisWheel.getName());
    }

    @Test
    public void setPrice() {
        ferrisWheel.setPrice(7.50);
        assertEquals(7.50, ferrisWheel.getPrice(), 0.10);
    }

    @Test
    public void setMinHeight(){
        ferrisWheel.setMinHeight(140);
        assertEquals(140, ferrisWheel.getMinHeight());
    }

    @Test
    public void ride(){
        assertEquals("FerrisWheel ride", ferrisWheel.ride());
    }
}
