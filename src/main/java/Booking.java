import java.util.ArrayList;

public class Booking {

    private Bedroom bedroom;
    private int duration;
    private Guest guest;

    public Booking(int duration, Bedroom bedroom, Guest guest) {
        this.duration = duration;
        this.bedroom = bedroom;
        this.guest = guest;
    }

    public int getDuration() {
        return duration;
    }

    public int getBedRoomRate(){
        return this.bedroom.getNightlyRate();
    }


//    public ArrayList<Guest> getGuests() {
//        return guests;
//    }
}
