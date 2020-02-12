import java.util.ArrayList;

public class Bedroom {

    private int roomNum;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNum, int capacity, String type) {
        this.roomNum = roomNum;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
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
}
