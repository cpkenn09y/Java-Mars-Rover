package MarsRoverTests;

import MarsRover.Grid;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by KennethYu on 8/30/14.
 */
public class GridTest {
    @Test
    public void testCols() {
        Grid testGrid = new Grid(3, 6);
        assertEquals(
            "Grids should have a cols attribute",
            testGrid.cols,
            4
        );
    }

    @Test
    public void testRows() {
        Grid testGrid = new Grid(3, 6);
        assertEquals(
            "Grids should have a rows attribute",
            testGrid.rows,
            7
        );
    }

    @Test
    public void testBody2x2() {
        Grid testGrid1 = new Grid(2,2);
        String[][] intArrayTwoD = {{"__","__","__"}, {"__","__","__"}, {"__","__","__"}};
        assertArrayEquals(
            "A 2x2 grid should have 3 columns and 3 rows, a total of 9 coordinates",
            testGrid1.body,
            intArrayTwoD
        );
    }

    @Test
    public void testBody2x3() {
        Grid testGrid2 = new Grid(2,3);
        String[][] intArrayTwoD = {{"__","__","__"}, {"__","__","__"}, {"__","__","__"}, {"__","__","__"}};
        assertArrayEquals(
            "A 2x3 grid should have 3 columns and 4 rows, totaling 12 coordinates",
            testGrid2.body,
            intArrayTwoD
        );
    }

}
