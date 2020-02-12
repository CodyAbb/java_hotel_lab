import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    private Conference conference1;
    private Conference conference2;

    @Before
    public void before(){
        conference1 = new Conference("Skye", 3);
        conference2 = new Conference("Arran", 4);
    }

    @Test
    public void canGetName(){
        assertEquals("Skye", conference1.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(3, conference1.getCapacity());
    }
}
