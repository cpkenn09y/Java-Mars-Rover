package MarsRover;
import java.util.Arrays;

/**
 * Created by KennethYu on 8/28/14.
 */
public class Grid {

    public int rows;
    public int cols;
    public String[][] body;
    private static final String DEFAULT_FILLER = "__";

    public Grid(int xMax, int yMax) {
        cols = xMax + 1;
        rows = yMax + 1;

        this.createBody();
    }

    private void createBody() {
        this.body = new String[this.rows][this.cols];

        for (int i = 0; i < this.body.length; i++) {
            Arrays.fill(this.body[i], DEFAULT_FILLER);
        }
    }

    public void placeRover(Rover rover) {
        this.body[this.body.length - rover.y -1][rover.x] = rover.name;
    };

}