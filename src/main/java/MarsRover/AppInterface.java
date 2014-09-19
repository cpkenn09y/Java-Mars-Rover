package MarsRover;

import java.io.IOException;

/**
 * Created by KennethYu on 9/1/14.
 */
public class AppInterface {

    public static void main(String[] args) throws IOException {
        AppController appController = new AppController();
        // READ TEXT FILE AND MENTION PARSER
        String txtFilePath = args.length == 0 ? "TW_input.txt" : args[0];
        appController.read(txtFilePath);
        ContextPrinter.printTextFileBeingRead();
        ContextPrinter.printList(appController.Parser.inputList);
        ContextPrinter.printParserExtractingData();

        // CREATE GRID
        appController.createGrid();
        ContextPrinter.printGridCreated();
        ContextPrinter.printSetUpToCurrentGridState();
        Printer.show(appController.Grid.body);
        Printer.show("");
        ContextPrinter.pause(2000);

        // CREATE ROVERS
        appController.createRovers();
        ContextPrinter.printCreatingRovers();
        ContextPrinter.printRoversCreated(appController.Rovers);

        // PLACING ROVERS
        ContextPrinter.printNowPlacingRovers();
        appController.placeRovers();

        // ROVER INITIAL POSITIONS
        ContextPrinter.printPositionsStatement("INITIAL");
        Printer.show(appController.Grid.body);
        Printer.show("");
        ContextPrinter.pause(2000);
        ContextPrinter.printRoverPositions(appController.Rovers);

        // ROVER EXECUTE MOVEMENT COMMANDS
        ContextPrinter.printRoversExecuteCommands();
        appController.moveRovers();

        // ROVERS IN FINAL POSITION
        ContextPrinter.printPositionsStatement("FINAL");
        Printer.show(appController.Grid.body);
        Printer.show("");
        ContextPrinter.pause(2000);
        ContextPrinter.printRoverPositions(appController.Rovers);
    }
}
