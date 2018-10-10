import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedroomList;
    private ArrayList<DiningRoom> diningRoomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;

    public Hotel(String name){
        this.name = name;
        this.bedroomList = new ArrayList<>();
        this.diningRoomList = new ArrayList<>();
        this.conferenceRoomList = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void addBedroom(Bedroom bedroom){
        bedroomList.add(bedroom);
    }

    public void addDiningRoom(DiningRoom diningRoom){
        diningRoomList.add(diningRoom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRoomList.add(conferenceRoom);
    }


    public ArrayList<Bedroom> getBedroomList() {
        return bedroomList;
    }

    public ArrayList<DiningRoom> getDiningRoomList() {
        return diningRoomList;
    }

    public ArrayList<ConferenceRoom> getConferenceRoomList() {
        return conferenceRoomList;
    }


    public void checkInBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkOutBedroom(Bedroom bedroom){
        bedroom.clearRoom();
    }


    public void checkInDiningRoom(Guest guest, DiningRoom diningRoom) {
        diningRoom.addGuest(guest);
    }

    public void checkOutDiningRoom(DiningRoom diningRoom) {
        diningRoom.removeGuest();
    }

    public void clearDiningRoom(DiningRoom diningRoom){
        diningRoom.clearRoom();
    }

    public void checkInConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public void checkOutConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest();
    }

    public void clearConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRoom.clearRoom();
    }
}
