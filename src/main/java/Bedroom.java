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
}
