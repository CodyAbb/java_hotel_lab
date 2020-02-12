import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

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

    @Test
    public void getAvailabilityOfBedroom(){
        assertEquals(true, hotel1.bedroomAvaliable(bedroom1));
    }

    @Test
    public void getAvailabilityOfConferenceRoom(){
        assertEquals(true, hotel1.conferenceRoomAvaliable(conferenceRoom1));
    }

    @Test
    public void checkGuestIntoBedroom(){
        hotel1.addGuestToBedroom(bedroom1, guest2);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void bedroomOccupiedCannotCheckIn(){
        hotel1.addGuestToBedroom(bedroom1, guest2);
        hotel1.addGuestToBedroom(bedroom1, guest3);
        hotel1.addGuestToBedroom(bedroom1, guest4);
        assertEquals(2, bedroom1.getNumberOfGuests());
    }

    @Test
    public void checkGuestIntoConferenceRoom(){
        hotel1.addGuestToConferenceRoom(conferenceRoom1, guest4);
        assertEquals(1, conferenceRoom1.getNumberOfAttendees());
    }

    @Test
    public void conferenceRoomOccupiedCannotCheckIn() {
        hotel1.addGuestToConferenceRoom(conferenceRoom1, guest4);
        hotel1.addGuestToConferenceRoom(conferenceRoom1, guest1);
        hotel1.addGuestToConferenceRoom(conferenceRoom1, guest2);
        hotel1.addGuestToConferenceRoom(conferenceRoom1, guest3);
        assertEquals(3, conferenceRoom1.getNumberOfAttendees());
    }

    @Test
    public void checkOutGuestFromBedroom(){
        hotel1.addGuestToBedroom(bedroom1, guest2);
        hotel1.addGuestToBedroom(bedroom1, guest3);
        hotel1.checkOutGuestOfBedroom(bedroom1, guest2);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void checkOutGuestFromConferenceRoom() {
        hotel1.addGuestToConferenceRoom(conferenceRoom1, guest4);
        hotel1.addGuestToConferenceRoom(conferenceRoom1, guest1);
        hotel1.addGuestToConferenceRoom(conferenceRoom1, guest2);
        hotel1.checkOutGuestOfConferenceRoom(conferenceRoom1, guest1);
        assertEquals(2, conferenceRoom1.getNumberOfAttendees());
    }

    @Test
    public void generateBookingFromGuestBookIn(){
        hotel1.bookRoom(3, bedroom1, guest2);
        hotel1.bookRoom(4, bedroom2, guest1);
        hotel1.bookRoom(2, bedroom2, guest4);
        ArrayList<Booking> listOfBookings = hotel1.returnListOfBookings();
        Booking testBooking = listOfBookings.get(0);
        assertEquals(3, hotel1.numberOfBookings());
    }

}

//bookings[0] = hotel1.bookRoom