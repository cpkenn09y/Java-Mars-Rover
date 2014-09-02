package MarsRoverTests;

import java.io.IOException;
import MarsRover.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by KennethYu on 8/30/14.
 */
public class AppControllerTest {

    @Test
    public void testReadStoresParser() throws IOException {
        AppController testApp = new AppController();
        testApp.read("TW_input.txt");

        assertTrue(
            "AppController's read method should store a Parser",
            testApp.Parser instanceof Parser
        );
    }

    @Test
    public void testCreateGrid() throws IOException {
        AppController testApp = new AppController();
        testApp.read("TW_input.txt");
        testApp.createGrid();

        assertTrue(
            "AppController's createGrid method should store a Grid",
            testApp.Grid instanceof Grid
        );
    }

    @Test
    public void testCreateRovers() throws IOException {
        AppController testApp = new AppController();
        testApp.read("TW_input.txt");
        testApp.createRovers();

        assertTrue(
            "AppController should be able to create rovers and store them",
            testApp.Rovers instanceof Rover[]
        );
    }

    @Test
    public void testPlaceRovers() throws IOException {
        String[][] expectedGridBody = {
            {"__", "__", "__", "__", "__", "__"},
            {"__", "__", "__", "__", "__", "__"},
            {"__", "__", "__", "r2", "__", "__"},
            {"__", "r1", "__", "__", "__", "__"},
            {"__", "__", "__", "__", "__", "__"},
            {"__", "__", "__", "__", "__", "__"}
        };

        AppController testApp = new AppController();
        testApp.read("TW_input.txt");
        testApp.createGrid();
        testApp.createRovers();
        testApp.placeRovers();

        assertArrayEquals(
            "AppController should properly place Rovers on Grid",
            testApp.Grid.body,
            expectedGridBody
        );
    }

    @Test
    public void testMoveRovers() throws IOException {
        String[][] expectedGridBody = {
            {"__", "__", "__", "__", "__", "__"},
            {"__", "__", "__", "__", "__", "__"},
            {"__", "r1", "__", "__", "__", "__"},
            {"__", "__", "__", "__", "__", "__"},
            {"__", "__", "__", "__", "__", "r2"},
            {"__", "__", "__", "__", "__", "__"}
        };

        AppController testApp = new AppController();
        testApp.read("TW_input.txt");
        testApp.createGrid();
        testApp.createRovers();
        testApp.placeRovers();
        testApp.moveRovers();

        assertArrayEquals(
            "AppController should properly move rovers on grid",
            testApp.Grid.body,
            expectedGridBody
        );
    }

    @Test
    public void testRun() throws IOException {
        String[][] expectedGridBody = {
            {"__", "__", "__", "__", "__", "__"},
            {"__", "__", "__", "__", "__", "__"},
            {"__", "r1", "__", "__", "__", "__"},
            {"__", "__", "__", "__", "__", "__"},
            {"__", "__", "__", "__", "__", "r2"},
            {"__", "__", "__", "__", "__", "__"}
        };

        AppController testApp = new AppController();
        testApp.run("TW_input.txt");

        assertArrayEquals(
            "AppController's read method should store a Parser",
            testApp.Grid.body,
            expectedGridBody
        );
    }

}
