package Lesson2;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class CountWord {

    public static Map<String, CountWord.Word> countWord(String content) {

        Pattern pattern1 = Pattern.compile("([?!,. \n\r\t])");
        Map<String, CountWord.Word> countMap = new LinkedHashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8))));
        String line;

        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String[] words = line.split(String.valueOf(pattern1));

            for (String word : words) {
                if ("".equals(word)) {
                    continue; }

                CountWord.Word wordObj = countMap.get(word);

                if (wordObj == null) {
                    wordObj = new CountWord.Word();
                    wordObj.word = word;
                    countMap.put(word, wordObj); }
                wordObj.count++; }
        }
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countMap;
    }

    public static class Word implements Comparable<Word> {
        String word;
        int count;

        public int ni() {
            return count = 0;
        }

        @Override
        public int hashCode() {
            return word.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return word.equals(((CountWord.Word) obj).word);
        }

        @Override
        public int compareTo(CountWord.Word b) {
            return b.count - count;
        }
    }
}


