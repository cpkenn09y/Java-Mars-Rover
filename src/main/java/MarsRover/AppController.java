package MarsRover;

import java.io.IOException;
import java.util.*;

/**
 * Created by KennethYu on 8/30/14.
 */
public class AppController {

    public Parser Parser;
    public Grid Grid;
    public Rover Rovers[];
    int roverCount;

    public AppController() {

    }

    public void read(String filePath) throws IOException {
        this.Parser = new Parser(TxtReader.read(filePath));
    }

    public Grid createGrid() {
        int[] gridMaxValues = this.Parser.getGridMaxValues();
        int xMax = gridMaxValues[0];
        int yMax = gridMaxValues[1];
        return this.Grid = new Grid(xMax, yMax);
    }

    public Rover[] createRovers() {
        this.roverCount = this.Parser.getRoverCount();
        this.Rovers = new Rover[this.roverCount];
        HashMap<String,HashMap<String,String>> roverPositions = this.Parser.getRoverPositions();
        for (int i = 0; i < this.roverCount; i++) {
            String roverName = "r" + (i + 1);
            HashMap<String,String> position = roverPositions.get(roverName);
            this.Rovers[i] = new Rover(roverName, position);
        }
        return this.Rovers;
    }

    public void placeRovers() {
        this.Grid.fillWithDefault();
        for (int i = 0; i < this.Rovers.length; i++) {
            this.Grid.placeRover(this.Rovers[i]);
        }
    }

    public void moveRovers() {
        HashMap<String,String> allRoverMovementData = this.Parser.getRoverMovements();
        for (int i = 0; i < this.roverCount; i++) {
            String movementCommands = this.getCommandsForRover(this.Rovers[i].name, allRoverMovementData);
            this.Rovers[i].execute(movementCommands);
        }

        this.placeRovers();
    }

    private String getCommandsForRover(String roverName, HashMap<String,String> movements) {
        return movements.get(roverName);
    }

    public void run(String txtFile) throws IOException {
        this.read(txtFile);
        this.createGrid();
        this.createRovers();
        this.placeRovers();
        this.moveRovers();
    }

    public static void main(String[] args) throws IOException {
        String defaultTxtFile = "TW_input.txt";
        AppController app = new AppController();
        app.run(defaultTxtFile);
    }
}
