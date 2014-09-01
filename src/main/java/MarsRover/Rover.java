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
    public char orientation;

    public Rover(String givenName, HashMap<String,String> position) {
        name = givenName;
        x = Integer.parseInt(position.get("xCoordinate"));
        y = Integer.parseInt(position.get("yCoordinate"));
        orientation = position.get("orientation").charAt(0);
    }

    public void moveForward() {
        switch (this.orientation) {
            case 'N': this.y += 1;
                break;
            case 'S': this.y -= 1;
                break;
            case 'E': this.x += 1;
                break;
            case 'W': this.x -= 1;
                break;
        }
    }

    public void turnRight() {
        switch (this.orientation) {
            case 'N': this.orientation = 'E';
                break;
            case 'E': this.orientation = 'S';
                break;
            case 'S': this.orientation = 'W';
                break;
            case 'W': this.orientation = 'N';
                break;
        }
    }

    public void turnLeft() {
        switch (this.orientation) {
            case 'N': this.orientation = 'W';
                break;
            case 'W': this.orientation = 'S';
                break;
            case 'S': this.orientation = 'E';
                break;
            case 'E': this.orientation = 'N';
                break;
        }
    }

    public void execute(String movementCommands) {
        String[] commandList = movementCommands.split("");
        for (int i = 0; i < commandList.length; i++) {
            this.doMovement(commandList[i]);
        }
    }

    private void doMovement(String command) {
        char commandChar = command.charAt(0);

        switch (commandChar) {
            case 'M': this.moveForward();
                break;
            case 'R': this.turnRight();
                break;
            case 'L': this.turnLeft();
                break;
        }
    }

}