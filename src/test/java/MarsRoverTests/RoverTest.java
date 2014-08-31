package MarsRoverTests;

import MarsRover.Rover;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;

/**
 * Created by KennethYu on 8/29/14.
 */
public class RoverTest {

    @Test
    public void testName() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "1");
        posData.put("yCoordinate", "2");
        posData.put("orientation", "N");
        Rover testRover = new Rover("r1", posData);
        assertEquals(
            "Rovers should have a name attribute",
            testRover.name,
            "r1"
        );
    }

    @Test
    public void testXCoordinate() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "E");
        Rover testRover = new Rover("r1", posData);
        assertEquals(
            "Rovers should have an x coordinate",
            testRover.x,
            "3"
        );
    }

    @Test
    public void testYCoordinate() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "E");
        Rover testRover = new Rover("r2", posData);
        assertEquals(
            "Rovers should have an y coordinate",
            testRover.y,
            "4"
        );
    }

    @Test
    public void testOrientation() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "E");
        Rover testRover = new Rover("r3", posData);
        assertEquals(
            "Rovers should have an orientation",
            testRover.orientation,
            "E"
        );
    }
}
