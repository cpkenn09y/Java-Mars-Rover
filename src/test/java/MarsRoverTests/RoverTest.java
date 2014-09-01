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
            3
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
            4
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
            'E'
        );
    }

    @Test
    public void testMoveForwardNorth() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "N");
        Rover testRover = new Rover("r1", posData);
        testRover.moveForward();
        assertEquals(
            "Rover should be able to move forward while facing North",
            testRover.y,
            5
        );
    }

    @Test
    public void testMoveForwardSouth() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "S");
        Rover testRover = new Rover("r1", posData);
        testRover.moveForward();
        assertEquals(
            "Rover should be able to move forward while facing South",
            testRover.y,
            3
        );
    }

    @Test
    public void testMoveForwardEast() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "E");
        Rover testRover = new Rover("r1", posData);
        testRover.moveForward();
        assertEquals(
            "Rover should be able to move forward while facing East",
            testRover.x,
            4
        );
    }

    @Test
    public void testMoveForwardWest() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "W");
        Rover testRover = new Rover("r1", posData);
        testRover.moveForward();
        assertEquals(
            "Rover should be able to move forward while facing West",
            testRover.x,
            2
        );
    }

    @Test
    public void testTurnRightNorthToEast() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "N");
        Rover testRover = new Rover("r1", posData);
        testRover.turnRight();
        assertEquals(
            "Rover should be able to turn right while facing North",
            testRover.orientation,
            'E'
        );
    }

    @Test
    public void testTurnRightEastToSouth() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "E");
        Rover testRover = new Rover("r1", posData);
        testRover.turnRight();
        assertEquals(
            "Rover should be able to turn right while facing East",
            testRover.orientation,
            'S'
        );
    }

    @Test
    public void testTurnRightSouthToWest() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "S");
        Rover testRover = new Rover("r1", posData);
        testRover.turnRight();
        assertEquals(
            "Rover should be able to turn right while facing South",
            testRover.orientation,
            'W'
        );
    }

    @Test
    public void testTurnRightWestToNorth() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "W");
        Rover testRover = new Rover("r1", posData);
        testRover.turnRight();
        assertEquals(
            "Rover should be able to turn right while facing West",
            testRover.orientation,
            'N'
        );
    }

    @Test
    public void testTurnLeftNorthToWest() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "N");
        Rover testRover = new Rover("r1", posData);
        testRover.turnLeft();
        assertEquals(
            "Rover should be able to turn left while facing North",
            testRover.orientation,
            'W'
        );
    }

    public void testTurnLeftWestToSouth() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "W");
        Rover testRover = new Rover("r1", posData);
        testRover.turnLeft();
        assertEquals(
            "Rover should be able to turn left while facing West",
            testRover.orientation,
            'S'
        );
    }

    public void testTurnLeftSouthToEast() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "S");
        Rover testRover = new Rover("r1", posData);
        testRover.turnLeft();
        assertEquals(
            "Rover should be able to turn left while facing South",
            testRover.orientation,
            'E'
        );
    }

    public void testTurnLeftEastToNorth() {
        HashMap<String,String> posData = new HashMap();
        posData.put("xCoordinate", "3");
        posData.put("yCoordinate", "4");
        posData.put("orientation", "E");
        Rover testRover = new Rover("r1", posData);
        testRover.turnLeft();
        assertEquals(
            "Rover should be able to turn left while facing East",
            testRover.orientation,
            'N'
        );
    }

}
