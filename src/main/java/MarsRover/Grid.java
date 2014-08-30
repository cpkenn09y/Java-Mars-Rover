package MarsRover;
import java.util.Arrays;

/**
 * Created by KennethYu on 8/28/14.
 */
public class Grid {

    public int rows;
    public int cols;
    public int[][] body;

    public Grid(int xMax, int yMax) {
        cols = xMax + 1;
        rows = yMax + 1;

        this.createBody();
    }

    private void createBody() {
        this.body = new int[this.rows][this.cols];
    }

}