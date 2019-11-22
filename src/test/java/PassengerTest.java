import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before(){
        passenger1 = new Passenger("Oliver Frank", 2);
        passenger2 = new Passenger("Rose Frank", 3);
    }

    @Test
    public void getPassengerName(){
        assertEquals("Oliver Frank", passenger1.getName());
    }

    @Test
    public void checkPassengerBags(){
        assertEquals(3, passenger2.getBags());
    }
}
