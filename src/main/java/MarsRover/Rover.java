package MarsRover;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by KennethYu on 8/28/14.
 */
public class Rover {

    public String name;
    public int x;
    public int y;
    public String orientation;

    public Rover(String givenName, HashMap<String,String> position) {
        name = givenName;
        x = Integer.parseInt(position.get("xCoordinate"));
        y = Integer.parseInt(position.get("yCoordinate"));
        orientation = position.get("orientation");
    }
}