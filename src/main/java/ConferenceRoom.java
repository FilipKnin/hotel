import java.util.ArrayList;

public class ConferenceRoom {
    private String roomName;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String roomName, int capacity){
        this.roomName = roomName;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }


    public String getName() {
        return roomName;
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
