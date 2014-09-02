package MarsRover;

import java.io.IOException;

/**
 * Created by KennethYu on 9/1/14.
 */
public class AppInterface {

    public static void main(String[] args) throws IOException {
        AppController appController = new AppController();
        ContextPrinter cp = new ContextPrinter();

        // READ TEXT FILE AND MENTION PARSER
        appController.read(args[0]);
        cp.printTextFileBeingRead();
        cp.printList(appController.Parser.inputList);
        cp.printParserExtractingData();

        // CREATE GRID
        appController.createGrid();
        cp.printGridCreated();
        cp.printSetUpToCurrentGridState();
        Printer.show(appController.Grid.body);
        Printer.show("");
        cp.pause(2000);

        // CREATE ROVERS
        appController.createRovers();
        cp.printCreatingRovers();
        cp.printRoversCreated(appController.Rovers);

        // PLACING ROVERS
        cp.printNowPlacingRovers();
        appController.placeRovers();

        // ROVER INITIAL POSITIONS
        cp.printPositionsStatement("INITIAL");
        Printer.show(appController.Grid.body);
        Printer.show("");
        cp.pause(2000);
        cp.printRoverPositions(appController.Rovers);

        // ROVER EXECUTE MOVEMENT COMMANDS
        cp.printRoversExecuteCommands();
        appController.moveRovers();

        // ROVERS IN FINAL POSITION
        cp.printPositionsStatement("FINAL");
        Printer.show(appController.Grid.body);
        Printer.show("");
        cp.pause(2000);
        cp.printRoverPositions(appController.Rovers);
    }
}
