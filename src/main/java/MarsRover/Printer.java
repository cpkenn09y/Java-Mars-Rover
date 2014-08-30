package MarsRover;

import java.util.Arrays;

/**
 * Created by KennethYu on 8/29/14.
 */
public class Printer {

    public static void show(int i) {
        System.out.println(i);
    }

    public static void show(String str) {
        System.out.println(str);
    }

    public static void show(String[] arrayWords) {
        int i;
        for (i=0; i < arrayWords.length; i++) {
            System.out.println(arrayWords[i]);
        }
    }

    public static void show(int[][] grid) {
        for (int i = 0; i < grid.length; i ++) {
            System.out.println(Arrays.toString(grid[i]));
        }
    }
}
