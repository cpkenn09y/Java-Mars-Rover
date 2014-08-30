package MarsRoverTests;

import MarsRover.Rover;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by KennethYu on 8/29/14.
 */
public class RoverTest {

    @Test
    public void testName() {
        Rover testRover = new Rover("George", 3, 6);
        assertEquals(testRover.name, "George");
    }

    @Test
    public void testCoordinates() {
        Rover testRover = new Rover("George", 3, 6);
        int[] arr = {3,6};
        assertArrayEquals(testRover.coordinates, arr);
    }

}
