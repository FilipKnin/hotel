import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;
    private double rate;

    public Bedroom(int roomNumber, int capacity, String type, double rate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<>();
        this.rate = rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
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

    public double getRate() {
        return rate;
    }
}
