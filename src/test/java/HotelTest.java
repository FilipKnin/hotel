import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
    Bedroom bedroom;
    Guest guest;

    @Before
    public void beforeEach() {
        hotel = new Hotel("Fluffy Towers");
        bedroom = new Bedroom(10,2,"DBL", 24.99);
        conferenceRoom = new ConferenceRoom("The Hall", 200);
        diningRoom = new DiningRoom("The Egg Lounge", 50);
        guest = new Guest();
    }

    @Test
    public void getName(){
        assertEquals("Fluffy Towers", hotel.getName() );
    }

    @Test
    public void getBedroomList(){
        assertEquals(0, hotel.getBedroomList().size() );
    }

    @Test
    public void addBedrooms(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedroomList().size() );
    }

    @Test
    public void getDiningRoomList(){
        assertEquals(0, hotel.getDiningRoomList().size() );
    }

    @Test
    public void addDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.getDiningRoomList().size() );
    }

    @Test
    public void getConferenceRoomList(){
        assertEquals(0, hotel.getConferenceRoomList().size() );
    }

    @Test
    public void addConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRoomList().size() );
    }

    @Test
    public void checkInBedroom(){
        hotel.addBedroom(bedroom);
        hotel.checkInBedroom(guest, bedroom);
        assertEquals(1, bedroom.getGuestList().size() );
        assertEquals(0, hotel.getBedroomList().size());
        assertEquals(1, hotel.getOccupied().size());
    }

    @Test
    public void checkOutBedroom(){
        hotel.addBedroom(bedroom);
        hotel.checkInBedroom(guest, bedroom);
        assertEquals(1, bedroom.getGuestList().size() );
        hotel.checkOutBedroom(bedroom);
        assertEquals(0, bedroom.getGuestList().size() );
        assertEquals(1, hotel.getBedroomList().size());
        assertEquals(0, hotel.getOccupied().size());
    }

    @Test
    public void checkInDiningRoom(){
        hotel.checkInDiningRoom(guest, diningRoom);
        assertEquals(1, diningRoom.getGuestList().size() );
    }

    @Test
    public void checkOutDiningRoom(){
        hotel.checkInDiningRoom(guest, diningRoom);
        assertEquals(1, diningRoom.getGuestList().size() );
        hotel.checkOutDiningRoom(diningRoom);
        assertEquals(0, diningRoom.getGuestList().size() );
    }

    @Test
    public void clearDiningRoom(){
        hotel.checkInDiningRoom(guest, diningRoom);
        hotel.checkInDiningRoom(guest, diningRoom);
        hotel.checkInDiningRoom(guest, diningRoom);
        assertEquals(3, diningRoom.getGuestList().size() );
        hotel.clearDiningRoom(diningRoom);
        assertEquals(0, diningRoom.getGuestList().size() );
    }

    @Test
    public void checkInConferenceRoom(){
        hotel.checkInConferenceRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.getGuestList().size() );
    }

    @Test
    public void checkOutConferenceRoom(){
        hotel.checkInConferenceRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.getGuestList().size() );
        hotel.checkOutConferenceRoom(conferenceRoom);
        assertEquals(0, conferenceRoom.getGuestList().size() );
    }

    @Test
    public void clearConferenceRoom(){
        hotel.checkInConferenceRoom(guest, conferenceRoom);
        hotel.checkInConferenceRoom(guest, conferenceRoom);
        hotel.checkInConferenceRoom(guest, conferenceRoom);
        assertEquals(3, conferenceRoom.getGuestList().size() );
        hotel.clearConferenceRoom(conferenceRoom);
        assertEquals(0, conferenceRoom.getGuestList().size() );
    }

    @Test
    public void makeBooking(){
        hotel.addBedroom(bedroom);
        Booking booking  = hotel.makeBooking(10, 5);
        assertEquals(10, booking.getRoom().getRoomNumber() );
        assertEquals(5, booking.getNumberOfNights());
        assertEquals(124.95, booking.getBill(), 0.5);
    }


}