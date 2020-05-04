import java.util.ArrayList;

public class FlightManager {

    private Flight flight;
    private Plane plane;
    private Passenger passenger;
    private int bagWeight;
    private ArrayList<Passenger> passengers;

    public FlightManager(Flight flight, Plane plane, ArrayList<Passenger> passengers){
        this.plane  = plane;
        this.passenger = passenger;
        this.flight = flight;
        this.bagWeight = 15;
    }

    public int passengerWeightAllowance(){
        return this.plane.getPlaneHoldWeight() / this.plane.getPlaneCapacity();
    }
//    public int getLuggageWeight(){
//        this.flight.getPassengerCount() * (this.passengers.getTotalBags());
////        this.bagWeight * this.passenger.getBags();
//
//    }

}
