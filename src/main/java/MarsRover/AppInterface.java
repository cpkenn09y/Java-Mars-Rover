package MarsRover;

import java.io.IOException;

/**
 * Created by KennethYu on 9/1/14.
 */
public class AppInterface {

    private static void readTxtFile(AppController controller, String[] args) throws IOException {
        String txtFilePath = args.length == 0 ? "TW_input.txt" : args[0];
        controller.read(txtFilePath);
        ContextPrinter.printTextFileBeingRead();
        ContextPrinter.printList(controller.Parser.inputList);
        ContextPrinter.printParserExtractingData();
    }

    private static void createGrid(AppController controller) {
        controller.createGrid();
        ContextPrinter.printGridCreated();
        ContextPrinter.printSetUpToCurrentGridState();
        Printer.show(controller.Grid.body);
        Printer.show("");
        ContextPrinter.pause(2000);
    }

    private static void createRover(AppController controller) {
        controller.createRovers();
        ContextPrinter.printCreatingRovers();
        ContextPrinter.printRoversCreated(controller.Rovers);
    }

    private static void placeRovers(AppController controller) {
        ContextPrinter.printNowPlacingRovers();
        controller.placeRovers();
    }

    private static void printInitialRoverPositions(AppController controller) {
        ContextPrinter.printPositionsStatement("INITIAL");
        Printer.show(controller.Grid.body);
        Printer.show("");
        ContextPrinter.pause(2000);
        ContextPrinter.printRoverPositions(controller.Rovers);
    }

    private static void executeRoverCommands(AppController controller) {
        ContextPrinter.printRoversExecuteCommands();
        controller.moveRovers();
    }

    private static void printFinalRoverPositions(AppController controller) {
        ContextPrinter.printPositionsStatement("FINAL");
        Printer.show(controller.Grid.body);
        Printer.show("");
        ContextPrinter.pause(2000);
        ContextPrinter.printRoverPositions(controller.Rovers);
    }

    public static void main(String[] args) throws IOException {
        AppController appController = new AppController();
        readTxtFile(appController, args);
        createGrid(appController);
        createRover(appController);
        placeRovers(appController);
        printInitialRoverPositions(appController);
        executeRoverCommands(appController);
        printFinalRoverPositions(appController);
    }
}
