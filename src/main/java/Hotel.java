import java.awt.print.Book;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Conference> conferenceRooms;
    private ArrayList<Guest> guests;
    private ArrayList<Booking> bookings;

    public Hotel(){
        bedrooms = new ArrayList<Bedroom>();
        conferenceRooms = new ArrayList<Conference>();
        guests = new ArrayList<Guest>();
        bookings = new ArrayList<Booking>();
    }

    public int numberOfBedrooms(){
        return this.bedrooms.size();
    }

    public int numberOfConferences(){
        return this.conferenceRooms.size();
    }

    public int numberOfGuests(){
        return this.guests.size();
    }

    public int numberOfBookings(){
        return this.bookings.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(Conference conference){
        this.conferenceRooms.add(conference);
    }

    public boolean bedroomAvaliable(Bedroom bedroom1) {
        if (bedroom1.getNumberOfGuests() < bedroom1.getRoomCapacity()) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean conferenceRoomAvaliable(Conference conference1) {
        if (conference1.getNumberOfAttendees() < conference1.getCapacity()){
            return true;
        }
        else {
            return false;
        }
    }

    public void addGuestToBedroom(Bedroom bedroom1, Guest guest2) {
        if (bedroomAvaliable(bedroom1)) {
            bedroom1.addGuest(guest2);
        }
    }

    public void addGuestToConferenceRoom(Conference conferenceRoom1, Guest guest4) {
        if (conferenceRoomAvaliable(conferenceRoom1)) {
            conferenceRoom1.addGuest(guest4);
        }
    }

    public void checkOutGuestOfBedroom(Bedroom bedroom1, Guest guest2) {
        bedroom1.removeGuest(guest2);
    }

    public void checkOutGuestOfConferenceRoom(Conference conferenceRoom1, Guest guest1) {
        conferenceRoom1.removeGuest(guest1);
    }

    public ArrayList<Booking> returnListOfBookings(){
        ArrayList<Booking> copyOfBookings = new ArrayList<Booking>(this.bookings);
        return copyOfBookings;
    }

    public void bookRoom(int durationOfStay, Bedroom bedroom, Guest guest){
        Booking booking1 = new Booking(durationOfStay, bedroom, guest);
        this.bookings.add(booking1);
    }
}
