package MarsRover;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by KennethYu on 8/28/14.
 */
public class Rover {

    public String name;
    public String x;
    public String y;
    public String orientation;

    public Rover(String givenName, HashMap<String,String> position) {
        name = givenName;
        x = position.get("xCoordinate");
        y = position.get("yCoordinate");
        orientation = position.get("orientation");
    }
}