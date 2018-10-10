import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void beforeEach(){
        bedroom = new Bedroom(13, 2, "DBL");
        guest = new Guest();
    }

    @Test
    public void getNumber(){
        assertEquals(13, bedroom.getRoomNumber() );
    }

    @Test
    public void getCapacity(){
        assertEquals(2, bedroom.getCapacity() );
    }

    @Test
    public void getType(){
        assertEquals("DBL", bedroom.getType() );
    }

    @Test
    public void getGuestList(){
        assertEquals(0, bedroom.getGuests().size() );
    }

    @Test
    public void addGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size() );
    }

    @Test
    public void clearRoom(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.getGuests().size() );
        bedroom.clearRoom();
        assertEquals(0, bedroom.getGuests().size() );
    }



}
