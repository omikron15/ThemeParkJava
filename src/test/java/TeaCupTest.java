import Rides.TeaCup;
import org.junit.Before;
import org.junit.Test;

public class TeaCupTest {

    TeaCup teaCup;

    @Before
    public void before(){
        teaCup = new TeaCup("TeaCup Ride 1", 5.00, 10,  130);
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
        assertEquals(130, teaCup.getMinHeight);
    }

    @Test
    public void setName() {
        teaCup.setName("TeaCup Ride 2");
        assertEquals("TeaCup Ride 1", teaCup.getName());
    }

    @Test
    public void setPrice() {
        teaCup.setPrice(7.50);
        assertEquals(7.50, teaCup.getPrice(), 0.10);
    }

    @Test
    public void setMinHeight(){
        teaCup.setMinHeight(140);
        aassertEquals(140, teaCup.getMinHeight);
    }
}
