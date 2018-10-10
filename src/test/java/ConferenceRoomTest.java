import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void beforeEach(){
        conferenceRoom = new ConferenceRoom("The Geralt Room", 100);
        guest = new Guest();
    }

    @Test
    public void getRoomName(){
        assertEquals("The Geralt Room", conferenceRoom.getName() );
    }

    @Test
    public void getCapacity(){
        assertEquals(100, conferenceRoom.getCapacity() );
    }

    @Test
    public void getGuests(){
        assertEquals(0, conferenceRoom.getGuestList().size() );
    }

    @Test
    public void addGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuestList().size() );
    }

    @Test
    public void clearRoom(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(2, conferenceRoom.getGuestList().size() );
        conferenceRoom.clearRoom();
        assertEquals(0, conferenceRoom.getGuestList().size() );
    }

    @Test
    public void removeGuest(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(2, conferenceRoom.getGuestList().size() );
        conferenceRoom.removeGuest();
        assertEquals(1, conferenceRoom.getGuestList().size() );
    }

}
