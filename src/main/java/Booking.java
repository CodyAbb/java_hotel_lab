import java.util.ArrayList;

public class Booking {

    private ArrayList<Bedroom> bedrooms;
    private int duration;
    private ArrayList<Guest> guests;

    public Booking(int duration, Bedroom bedroom, Guest guest) {
        this.duration = duration;
        this.bedrooms = new ArrayList<Bedroom>();
        this.guests = new ArrayList<Guest>();
    }

    public int getDuration() {
        return duration;
    }

//    public ArrayList<Guest> getGuests() {
//        return guests;
//    }
}
