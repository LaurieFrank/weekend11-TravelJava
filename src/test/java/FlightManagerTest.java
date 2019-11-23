import org.junit.Before;
import org.junit.Test;

public class FlightManagerTest {

    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before(){
        flight = new Flight(PlaneType.BOEING747, "BA6702", "QTR", "EDI", "0630");
        passenger1 = new Passenger("Oliver Frank", 2);
        passenger2 = new Passenger("Rose Frank", 3);
    }

    @Test
    public void getAvailableBaggageWeight(){
        assertEquals(262, planeType.getAvailableBaggageWeight());
    }
}
