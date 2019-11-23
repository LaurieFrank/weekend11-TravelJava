import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before(){
        flight = new Flight(PlaneType.BOEING747, "BA6702", "QTR", "EDI", "0630");
        passenger1 = new Passenger("Oliver Frank", 2);
        passenger2 = new Passenger("Rose Frank", 3);
    }

/*
    @Test
    public void getPlaneType(){
        assertEquals(PlaneType.BOEING747, flight.)
    }
*/

    @Test
    public void getFlightNumber(){
        assertEquals("BA6702", flight.getFlightNumber());
    }

    @Test
    public void getDestination(){
        assertEquals("QTR", flight.getDestination());
    }

    @Test
    public void getDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void getDepartureTime(){
        assertEquals("0630", flight.getDepartureTime());
    }

    @Test
    public void getPassengerNumbers(){
        assertEquals(0, flight.getPassengerNumbers());
    }

}