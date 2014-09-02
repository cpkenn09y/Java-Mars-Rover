package MarsRoverTests;

import MarsRover.Parser;
import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.*;

/**
 * Created by KennethYu on 8/30/14.
 */
public class ParserTest {

    @Test
    public void testGetGridMaxValues() {
        String[] sampInput = { "3 4", "1 2 N", "LRM"};
        Parser sampParser = new Parser(sampInput);
        int[] expectedMaxValues = { 3, 4 };
        assertArrayEquals(
            "Parser should be able to extract grid max values; returning an array of two integers",
            sampParser.getGridMaxValues(),
            expectedMaxValues
        );
    }

    @Test
    public void testGetRoverCount() {
        String[] sampInput = { "3 4", "1 2 N", "LRM", "2 2 E", "LRL"};
        Parser sampParser = new Parser(sampInput);
        assertEquals(
            "Parser should be able to get total rover count",
            sampParser.getRoverCount(),
            2
        );
    }

    @Test
    public void testGetRoverPositionsForTwoRovers() {
        String[] sampInput = { "3 4", "1 2 N", "LRM", "2 2 E", "LRL"};
        Parser sampParser = new Parser(sampInput);
        HashMap<String, HashMap<String,String>> expectedPositions = new HashMap();

        HashMap<String,String> posData1 = new HashMap();
        posData1.put("xCoordinate", "1");
        posData1.put("yCoordinate", "2");
        posData1.put("orientation", "N");

        HashMap<String,String> posData2 = new HashMap();
        posData2.put("xCoordinate", "2");
        posData2.put("yCoordinate", "2");
        posData2.put("orientation", "E");

        expectedPositions.put("r1", posData1);
        expectedPositions.put("r2", posData2);
        assertEquals(
            "Parser should be able to get rover positions",
            sampParser.getRoverPositions(),
            expectedPositions
        );
    }

    @Test
    public void testGetRoverMovements() {
        String[] sampInput = { "3 4", "1 2 N", "LRM", "2 2 E", "LRL", "3 3 S", "MLM"};
        Parser sampParser = new Parser(sampInput);
        HashMap<String, String> expectedMovements = new HashMap();
        expectedMovements.put("r1", "LRM");
        expectedMovements.put("r2", "LRL");
        expectedMovements.put("r3", "MLM");
        assertEquals(
            "Parser should be able to get rover movements for many rovers",
            sampParser.getRoverMovements(),
            expectedMovements
        );
    }
}
