package by.kvrnk.park.fileWorker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileWorker {

    public static String[] readFromFile(String pathToFile) {
        List<String> lines = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            return lines.toArray(new String[0]);
        } catch (IOException exc) {
            System.out.println("IO error!" + exc);
            throw new IllegalArgumentException();
        }
    }
}
