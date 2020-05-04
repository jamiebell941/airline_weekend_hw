import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private ArrayList<Passenger> passengers;
    
    @Before
    public void before(){
        passenger1= new Passenger("Jim", 2);
        passenger2= new Passenger("Tim", 2);
        passenger3= new Passenger("Joe", 2);
        plane= new Plane(PlaneType.BOEING747);
        flight= new Flight(passengers, plane, 102, "EDN", "GLA", "20:00");
        flightManager = new FlightManager(flight, plane, passengers);
    }


    @Test
    public void canGetPassengerAllowance(){
        assertEquals(20, this.flightManager.passengerWeightAllowance(plane));
    }

    @Test
    public void canGetPassengerBagWeight(){
        passenger1= new Passenger("Jim", 2);
        passenger2= new Passenger("Tim", 2);
        passenger3= new Passenger("Joe", 2);
        passenger3= new Passenger("Ben", 2);
        passenger3= new Passenger("Dan", 2);
        assertEquals(90, this.flightManager.getPassengerBagWeight(this.passengers));
    }
//    @Test
//    public void canGetLuggageWeight(){
//        passengers.add(passenger);
//        assertEquals(45, flightManager.getLuggageWeight());
//    }
}
