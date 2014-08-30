package MarsRoverTests;

import MarsRover.Rover;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by KennethYu on 8/29/14.
 */
public class RoverTest {

    @Test
    public void testName() {
        Rover testRover = new Rover("George", 3, 6);
        assertEquals(
            "Rovers should have a name attribute",
            testRover.name,
            "George"
        );
    }

    @Test
    public void testCoordinates() {
        Rover testRover = new Rover("George", 3, 6);
        int[] coordinates = {3,6};
        assertArrayEquals(
            "Rovers should have coordinates that are an array of two integers",
            testRover.coordinates,
            coordinates
        );
    }

}
