import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private ArrayList<Passenger> passengers;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Plane plane;


    @Before
    public void before(){
        this.passenger1 = new Passenger("Dave", 2);
        this.passenger2 = new Passenger("Jack", 3);
        this.passenger3 = new Passenger("Bill", 1);
        this.plane = new Plane(PlaneType.BOEING747);
        this.passengers = new ArrayList<Passenger>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        flight = new Flight(passengers, plane, 101, "GLA", "EDN", "19:00");


    }

    @Test
    public void canGetplane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNum(){
        assertEquals(101, flight.getFlightNum());
    }

    @Test
    public void canGetDestination(){
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void canGetDepLoc(){
        assertEquals("EDN", flight.getDepLoc());
    }

    @Test
    public void canGetDepTim(){
        assertEquals("19:00", flight.getDepTim());
    }

    @Test
    public void canGetPassengerCount(){
        assertEquals(3, flight.getPassengerCount());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(5, flight.getPlane().getPlaneCapacity());
    }

    @Test
    public void canGetFreeSeats(){
        assertEquals(2, flight.getFreeSeats());
    }

    @Test
    public void canBookSeat(){
        flight.bookSeat(new Passenger("Tom", 3));
        assertEquals(1, flight.getFreeSeats());
    }
    @Test
    public void cantBookSeat(){
        flight.bookSeat(new Passenger("Tom", 3));
        flight.bookSeat(new Passenger("Bob", 2));
        flight.bookSeat(new Passenger("Jeff", 3));
        assertEquals(5, flight.getPassengerCount());
        assertEquals(0, flight.getFreeSeats());
    }
}
