import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType(){
        plane.getPlaneType();
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }
    @Test
    public void canGetPlaneWeight(){
        assertEquals(20, plane.getPlaneWeight());
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(5, plane.getPlaneCapacity());
    }
    @Test
    public void canGetPlaneHoldWeight(){
        assertEquals(100, this.plane.getPlaneHoldWeight());
    }
}
