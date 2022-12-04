package Lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PrintText {
    public static void print(Map<String, CountWord.Word> countMap) {

        List<CountWord.Word> sWords = new ArrayList<>(countMap.values());

        for (CountWord.Word word : sWords) {
            System.out.println(word.count + "\t" + word.word); }
    }
}
