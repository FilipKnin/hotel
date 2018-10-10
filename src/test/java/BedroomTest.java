import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void beforeEach(){
        bedroom = new Bedroom(13, 2, "DBL");
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

}
