import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking1;
    private Booking booking2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before() {
        booking1 = new Booking(3);
        booking2 = new Booking(2);
        guest1 = new Guest("Ross");
        guest2 = new Guest("Matteo");
        guest3 = new Guest("Andrew");

    }

    @Test
    public void getDurationOfNights() {
        assertEquals(3, booking1.getDuration());
    }


}
