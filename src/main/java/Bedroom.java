import java.util.ArrayList;

public class Bedroom {

    private int roomNum;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;
    private int nightlyRate;

    public Bedroom(int roomNum, int capacity, String type, int nightlyRate) {
        this.roomNum = roomNum;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return this.roomNum;
    }

    public int getRoomCapacity() {
        return this.capacity;
    }

    public String getRoomType() {
        return this.type;
    }

    public int getNumberOfGuests(){
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        int index = this.guests.indexOf(guest);
        this.guests.remove(index);
    }

    public int getNightlyRate(){
        return this.nightlyRate;
    }


}
