package MarsRover;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;

/**
 * Created by KennethYu on 8/29/14.
 */
public class Parser {

    String[] inputList;

    public Parser(String[] input) {
        this.inputList = input;
    }

    public int[] getGridMaxValues() {
        String[] gridDataStr = this.inputList[0].split("\\s+");
        int[] gridDataInt = { Integer.parseInt(gridDataStr[0]), Integer.parseInt(gridDataStr[1]) };
        return gridDataInt;
    }

    public int getRoverCount() {
        return this.inputList.length/2;
    }

    public HashMap<String, HashMap<String,String>> getRoverPositions() {
        HashMap<String, HashMap<String,String>> positions = new HashMap();

        int txtFileIndex = 1;

        for (int i = 0; i < this.getRoverCount(); i++) {
            String currentRover = "r" + (i + 1);
            HashMap<String, String> roverInitialData = extractRoverInitialData(this.inputList[txtFileIndex]);
            positions.put(currentRover, roverInitialData);
            txtFileIndex += 2;
        }

        return positions;
    }

    private HashMap<String, String> extractRoverInitialData(String rawPositionData) {
        HashMap<String, String> useablePositionData = new HashMap();
        String[] splitRoverData = rawPositionData.split("\\s+");
        useablePositionData.put("xCoordinate", splitRoverData[0]);
        useablePositionData.put("yCoordinate", splitRoverData[1]);
        useablePositionData.put("orientation", splitRoverData[2]);
        return useablePositionData;
    }

    public HashMap<String, String> getRoverMovements() {
        HashMap<String, String> movements = new HashMap();

        int txtFileIndex = 2;

        for (int i = 0; i < this.getRoverCount(); i++) {
            String currentRover = "r" + (i + 1);
            movements.put(currentRover, this.inputList[txtFileIndex]);
            txtFileIndex += 2;
        }

        return movements;
    }
}
