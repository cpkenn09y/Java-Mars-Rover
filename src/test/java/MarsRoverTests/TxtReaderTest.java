package MarsRoverTests;

import MarsRover.TxtReader;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by KennethYu on 8/30/14.
 */
public class TxtReaderTest {

    @Test
    public void testGetLineCount() throws IOException {
        String filePath = "TW_input.txt";
        assertEquals(
            "TxtReader#getLineCount should return the number of lines within specified txt file",
            TxtReader.getLineCount(filePath),
            5
        );
    }

    @Test
    public void testRead() throws IOException {
        String filePath = "TW_input.txt";
        String[] txtLines = {"5 5", "1 2 N", "LMLMLMLMM", "3 3 E", "MMRMMRMRRM"};
        assertArrayEquals(
            "TxtReader#read should return an array of Strings based on the lines from the txt file",
            TxtReader.read(filePath),
            txtLines
        );
    }

}
