import java.util.ArrayList;
import java.util.BitSet;

public class DiningRoom {
    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

     public DiningRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuestList() {
        return guests;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void clearRoom() {
        guests.clear();
    }

    public Guest removeGuest() {
        return guests.remove(0);
    }
}
