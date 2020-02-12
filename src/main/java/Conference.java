import java.util.ArrayList;

public class Conference {

    private String name;
    private int capacity;
    private ArrayList<Guest> attendees;

    public Conference(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.attendees = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
