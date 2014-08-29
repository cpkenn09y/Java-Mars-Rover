package MarsRover;
import java.util.Arrays;

/**
 * Created by KennethYu on 8/28/14.
 */
public class Rover {

    public String name;
    public int[] coordinates = new int[2];

    public Rover(String givenName, int xCoordinate, int yCoordinate) {
        name = givenName;
        coordinates[0] = xCoordinate;
        coordinates[1] = yCoordinate;
    }
}