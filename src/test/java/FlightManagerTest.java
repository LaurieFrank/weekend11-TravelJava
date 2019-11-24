import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private FlightManager flightManager;
    private PlaneType planeType;

    @Before
    public void before(){
        flight = new Flight(PlaneType.BOEING747, "BA6702", "QTR", "EDI", "0630");
        passenger1 = new Passenger("Oliver Frank", 2);
        passenger2 = new Passenger("Rose Frank", 3);
        flightManager = new FlightManager(PlaneType.BOEING747);
    }

//    @Test
//    public void getAvailableBaggageWeight(){
//        assertEquals(262, flightManager.getAvailableBaggageWeight());
//    }

    @Test
    public void calculateBaggageWeightPerPassenger(){
        assertEquals(0.524, flightManager.calculateBaggageWeightPerPassenger());
    }
}
