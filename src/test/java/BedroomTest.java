import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void beforeEach(){
        bedroom = new Bedroom(13, 2, "DBL", 24.99);
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
        assertEquals(0, bedroom.getGuestList().size() );
    }

    @Test
    public void getRate(){
        assertEquals(24.99, bedroom.getRate(), 0.01);
    }

    @Test
    public void addGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestList().size() );
    }

    @Test
    public void clearRoom(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.getGuestList().size() );
        bedroom.clearRoom();
        assertEquals(0, bedroom.getGuestList().size() );
    }





}
