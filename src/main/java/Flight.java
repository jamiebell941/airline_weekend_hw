import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightNum;
    private String destination;
    private String depLoc;
    private String depTim;
    private Passenger passenger;

    public Flight(ArrayList<Passenger> passengers, Plane plane, int flightNum, String destination, String depLoc, String depTim) {
        this.passengers = passengers;
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.depLoc = depLoc;
        this.depTim = depTim;
        this.passenger = new Passenger("Tom", 2);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepLoc() {
        return depLoc;
    }

    public String getDepTim() {
        return depTim;
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public int getFreeSeats() {
       return (plane.getPlaneCapacity() - this.getPassengerCount());

    }

    public void bookSeat(Passenger passenger) {
        if (this.getFreeSeats() > 0)
        passengers.add(passenger);
        else return;
    }
}
