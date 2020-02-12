import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking1;
    private Booking booking2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Bedroom bedroom1;

    @Before
    public void before() {
        booking1 = new Booking(3, bedroom1, guest2);
        booking2 = new Booking(2, bedroom1, guest3);
        guest1 = new Guest("Ross");
        guest2 = new Guest("Matteo");
        guest3 = new Guest("Andrew");
        bedroom1 = new Bedroom(3, 2, "shagpad", 23);
    }

    @Test
    public void getDurationOfNights() {
        assertEquals(3, booking1.getDuration());
    }




}
