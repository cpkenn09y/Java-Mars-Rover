package MarsRover;
import java.util.Arrays;

/**
 * Created by KennethYu on 8/28/14.
 */
public class Grid {

    public int rows;
    public int cols;
    public int[][] body;

    public Grid(int colMax, int rowMax) {
        cols = colMax;
        rows = rowMax;

        this.createBody();
    }

    private void createBody() {
        this.body = new int[this.rows+1][this.cols+1];
    }

}