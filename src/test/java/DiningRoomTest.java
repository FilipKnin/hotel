import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    private DiningRoom diningRoom;
    private Guest guest;

    @Before
    public void beforeEach(){
        diningRoom = new DiningRoom("The Refectory", 25);
        guest = new Guest();
    }

    @Test
    public void getRoomName(){
        assertEquals("The Refectory", diningRoom.getName() );
    }

    @Test
    public void getCapacity(){
        assertEquals(25, diningRoom.getCapacity() );
    }

    @Test
    public void getGuests(){
        assertEquals(0, diningRoom.getGuestList().size() );
    }

    @Test
    public void addGuest(){
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getGuestList().size() );
    }

    @Test
    public void clearRoom(){
        diningRoom.addGuest(guest);
        diningRoom.addGuest(guest);
        assertEquals(2, diningRoom.getGuestList().size() );
        diningRoom.clearRoom();
        assertEquals(0, diningRoom.getGuestList().size() );
    }

    @Test
    public void removeGuest(){
        diningRoom.addGuest(guest);
        diningRoom.addGuest(guest);
        assertEquals(2, diningRoom.getGuestList().size() );
        diningRoom.removeGuest();
        assertEquals(1, diningRoom.getGuestList().size() );
    }
}
