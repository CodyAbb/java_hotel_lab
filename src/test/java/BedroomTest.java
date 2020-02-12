import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("Stephen");
        guest2 = new Guest("James");
        bedroom1 = new Bedroom(3, 2, "double", 10);
    }

    @Test
    public void getRoomNumber(){
        assertEquals(3, bedroom1.getRoomNumber());
    }

    @Test
    public void getRoomCapacity(){
        assertEquals(2, bedroom1.getRoomCapacity());
    }

    @Test
    public void getRoomType(){
        assertEquals("double", bedroom1.getRoomType());
    }
}
