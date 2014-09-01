package MarsRoverTests;

import MarsRover.Grid;
import MarsRover.Rover;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;

/**
 * Created by KennethYu on 8/30/14.
 */
public class GridTest {
    @Test
    public void testCols() {
        Grid grid = new Grid(3, 6);
        assertEquals(
            "Grids should have a cols attribute",
            grid.cols,
            4
        );
    }

    @Test
    public void testRows() {
        Grid grid = new Grid(3, 6);
        assertEquals(
            "Grids should have a rows attribute",
            grid.rows,
            7
        );
    }

    @Test
    public void testBody2x2() {
        Grid grid = new Grid(2,2);
        String[][] intArrayTwoD = {{"__","__","__"}, {"__","__","__"}, {"__","__","__"}};
        assertArrayEquals(
            "A 2x2 grid should have 3 columns and 3 rows, a total of 9 coordinates",
            grid.body,
            intArrayTwoD
        );
    }

    @Test
    public void testBody2x3() {
        Grid grid = new Grid(2,3);
        String[][] intArrayTwoD = {{"__","__","__"}, {"__","__","__"}, {"__","__","__"}, {"__","__","__"}};
        assertArrayEquals(
            "A 2x3 grid should have 3 columns and 4 rows, totaling 12 coordinates",
            grid.body,
            intArrayTwoD
        );
    }

    @Test
    public void testPlaceRover() {
        HashMap<String,String> position = new HashMap();
        position.put("xCoordinate", "1");
        position.put("yCoordinate", "3");
        position.put("orientation", "S");
        Rover rover = new Rover("r1", position);
        Grid grid = new Grid(2,3);
        grid.placeRover(rover);
        String[][] expectedGridBody = new String[][] {
            {"__", "r1", "__"},
            {"__", "__", "__"},
            {"__", "__", "__"},
            {"__", "__", "__"}
        };
        assertArrayEquals(
            "A grid should be able to place a rover at the proper location, (0,0) at bottom left",
            grid.body,
            expectedGridBody
        );
    }

    @Test
    public void testPlaceRovers() {
        HashMap<String,String> position1 = new HashMap();
        position1.put("xCoordinate", "0");
        position1.put("yCoordinate", "3");
        position1.put("orientation", "S");
        Rover rover1 = new Rover("r1", position1);

        HashMap<String,String> position2 = new HashMap();
        position2.put("xCoordinate", "2");
        position2.put("yCoordinate", "1");
        position2.put("orientation", "E");
        Rover rover2 = new Rover("r2", position2);

        Grid grid = new Grid(2,3);
        grid.placeRover(rover1);
        grid.placeRover(rover2);
        String[][] expectedGridBody = new String[][] {
                {"r1", "__", "__"},
                {"__", "__", "__"},
                {"__", "__", "r2"},
                {"__", "__", "__"}
        };
        assertArrayEquals(
                "A grid should be able to place multiple rovers at the proper location, (0,0) at bottom left",
                grid.body,
                expectedGridBody
        );
    }

}
