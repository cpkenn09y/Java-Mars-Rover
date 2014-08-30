package MarsRover;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by KennethYu on 8/29/14.
 */
public class TxtReader {

    public static String[] read(String filePath) throws IOException{
        FileReader file = new FileReader(filePath);
        BufferedReader bufferedFile = new BufferedReader(file);

        String[] textLines = new String[getLineCount(filePath)];
        String currentLine = bufferedFile.readLine();
        int i = 0;

        while (currentLine != null) {
            textLines[i] = currentLine;
            currentLine = bufferedFile.readLine();
            i++;
        }

        bufferedFile.close();
        return textLines;
    }
    
    private static int getLineCount(String filePath) throws IOException {
        FileReader file = new FileReader(filePath);
        BufferedReader bufferedFile = new BufferedReader(file);

        String currentLine = bufferedFile.readLine();
        int lineCount = 0;

        while (currentLine != null) {
            lineCount++;
            currentLine = bufferedFile.readLine();
        }

        bufferedFile.close();
        return lineCount;
    }

}
