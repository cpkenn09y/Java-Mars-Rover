package MarsRover;

import MarsRover.Rover;

/**
 * Created by KennethYu on 8/31/14.
 */
public class ContextPrinter {

    public static void printTextFileBeingRead() {
        System.out.println("Text file being read...");
        pauseAndPrintLine();
    }

    public static void printList(String[] inputList) {
        System.out.println("TEXT FILE READS AS FOLLOWS:");
        System.out.println("");
        pause(500);
        for (int i = 0; i < inputList.length; i++) {
            System.out.println(inputList[i]);
            pause(350);
        }
        System.out.println("");
    }

    public static void printParserExtractingData() {
        System.out.println("Parser is now extracting Grid and Rover data...");
        pauseAndPrintLine();
    }

    public static void printGridCreated() {
        System.out.println("Grid created!");
        pauseAndPrintLine();
    }

    public static void printSetUpToCurrentGridState() {
        System.out.println("GRID STATE IS AS FOLLOWS:");
        pauseAndPrintLine();
    }

    public static void printCreatingRovers() {
        System.out.println("");
        pause(1000);
        System.out.println("Now creating Rovers...");
        pause(2000);
        System.out.println("");
    }

    public static void printRoversCreated(Rover[] rovers) {
        String message = "ROVERS CREATED: ";

        for (int i = 0; i < rovers.length; i++) {
            message += rovers[i].name + " | ";
        }

        message = message.substring(0, message.length() - 2);
        System.out.println(message);

        pauseAndPrintLine();
    }

    public static void printNowPlacingRovers() {
        System.out.println("Now placing Rovers on Grid...");
        pause(2000);
        System.out.println("");
    }

    public static void printRoversExecuteCommands() {
        System.out.println("Now, Rovers execute the commands!!!");
        pauseAndPrintLine();
    }

    public static void printPositionsStatement(String position) {
        System.out.println("ROVERS " + position + " POSITIONS:");
        pauseAndPrintLine();
    }

    public static void printRoverPositions(Rover[] rovers) {
        for (int i = 0; i < rovers.length; i++) {
            System.out.println(rovers[i].name + " -> ( " + rovers[i].x + " , " + rovers[i].y + " , " + rovers[i].orientation + " )");
        }
        System.out.println("");
        pause(2000);
    }

    private static void pauseAndPrintLine() {
        pause(1000);
        System.out.println("");
    }

    public static void pause(Integer milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
