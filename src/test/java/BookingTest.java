import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking;
    Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(11, 1, "SGL", 18.99);
        booking = new Booking(bedroom1, 5);
    }

    @Test
    public void getNumberOfNights(){
        assertEquals(5, booking.getNumberOfNights() );
    }

    @Test
    public void getRate(){
        assertEquals(18.99, booking.getRate(), 0.01);
    }

    @Test
    public void getBill(){
        assertEquals(95.00, booking.getBill(), 0.50 );
    }

}
