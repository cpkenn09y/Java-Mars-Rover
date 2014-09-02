package MarsRover;

import MarsRover.Rover;

/**
 * Created by KennethYu on 8/31/14.
 */
public class ContextPrinter {

    public ContextPrinter() {

    }

    public void printTextFileBeingRead() {
        System.out.println("Text file being read...");
        pauseAndPrintLine();
    };

    public void printList(String[] inputList) {
        System.out.println("TEXT FILE READS AS FOLLOWS:");
        System.out.println("");
        pause(500);
        for (int i = 0; i < inputList.length; i++) {
            System.out.println(inputList[i]);
            pause(350);
        }
        System.out.println("");
    }

    public void printParserExtractingData() {
        System.out.println("Parser is now extracting Grid and Rover data...");
        pauseAndPrintLine();
    }

    public void printGridCreated() {
        System.out.println("Grid created!");
        pauseAndPrintLine();
    }

    public void printSetUpToCurrentGridState() {
        System.out.println("GRID STATE IS AS FOLLOWS:");
        pauseAndPrintLine();
    }

    public void printCreatingRovers() {
        System.out.println("");
        pause(1000);
        System.out.println("Now creating Rovers...");
        pause(2000);
        System.out.println("");
    }

    public void printRoversCreated(Rover[] rovers) {
        String message = "ROVERS CREATED: ";

        for (int i = 0; i < rovers.length; i++) {
            message += rovers[i].name + " | ";
        }

        message = message.substring(0, message.length() - 2);
        System.out.println(message);

        pauseAndPrintLine();
    }

    public void printNowPlacingRovers() {
        System.out.println("Now placing Rovers on Grid...");
        pause(2000);
        System.out.println("");
    }

    public void printRoversExecuteCommands() {
        System.out.println("Now, Rovers execute the commands!!!");
        pauseAndPrintLine();
    }

    public void printPositionsStatement(String position) {
        System.out.println("ROVERS " + position + " POSITIONS:");
        pauseAndPrintLine();
    }

    public void printRoverPositions(Rover[] rovers) {
        for (int i = 0; i < rovers.length; i++) {
            System.out.println(rovers[i].name + " -> ( " + rovers[i].x + " , " + rovers[i].y + " , " + rovers[i].orientation + " )");
        }
        System.out.println("");
        pause(2000);
    }

    private void pauseAndPrintLine() {
        pause(1000);
        System.out.println("");
    }

    public void pause(Integer milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
