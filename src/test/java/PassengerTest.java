import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Ash", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Ash", passenger1.getName());
    }

    @Test
    public void canGetBag(){
        assertEquals(2, passenger1.getBags());
    }
}
