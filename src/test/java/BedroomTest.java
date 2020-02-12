import org.junit.Before;

import java.util.ArrayList;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("Stephen");
        guest2 = new Guest("James");
        bedroom1 = new Bedroom(3, 2, "double");
    }
}
