import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Conference conferenceRoom1;
    private Conference conferenceRoom2;
    private Hotel hotel1;

    @Before
    public void before(){
        guest1 = new Guest("Catherine");
        guest2 = new Guest("Chris");
        guest3 = new Guest("Jen");
        guest4 = new Guest("Paddy");
        bedroom1 = new Bedroom(4, 2, "red");
        bedroom2 = new Bedroom(5, 2, "ice");
        conferenceRoom1 = new Conference("Harris", 3);
        conferenceRoom2 = new Conference("Isle of Mull", 2);
        hotel1 = new Hotel();

        hotel1.addBedroom(bedroom1);
        hotel1.addBedroom(bedroom2);
        hotel1.addConferenceRoom(conferenceRoom1);
    }

    @Test
    public void canAddBedroomsToHotel(){
        assertEquals(2, hotel1.numberOfBedrooms());
    }

    @Test
    public void canAddConferenceToHotel(){
        assertEquals(1, hotel1.numberOfConferences());
    }

//    @Test
//    public void canAddGuestToARoom(){
//        bedroom1.addGuest(guest1);
//        conferenceRoom1.addGuest(guest4);
//        assertEquals(1, bedroom1.getNumberOfGuests());
//        assertEquals(1, conferenceRoom1.getNumberOfAttendees());
//    }
}
