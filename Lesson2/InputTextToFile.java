package Lesson2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputTextToFile {
    public static String input() {
        String path = "/Users/админ/Desktop/test.txt";
        String stringWord = null;
        try {
            stringWord = Files.readString(Paths.get(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringWord.toLowerCase();
    }
}
