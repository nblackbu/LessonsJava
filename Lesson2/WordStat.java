package Lesson2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;

public class WordStat {

    private static String input() throws IOException {

        String path = "/Users/админ/Desktop/test.txt";
        String stringWord = Files.readString(Paths.get(path));
        return stringWord.toLowerCase();
    }

    private static Map<String, Word> countWord(String content) throws IOException {

        Pattern pattern1 = Pattern.compile("([?!,. \n\r\t])");
        Map<String, Word> countMap = new LinkedHashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8))));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split(String.valueOf(pattern1));

            for (String word : words) {
                if ("".equals(word)) {
                    continue; }

                Word wordObj = countMap.get(word);

                if (wordObj == null) {
                    wordObj = new Word();
                    wordObj.word = word;
                    countMap.put(word, wordObj); }
                wordObj.count++; }}
        reader.close();
        return countMap;
    }

    public static class Word implements Comparable<Word> {
        String word;
        int count;

        public int ni() {
           return count = 0;
        }
        @Override
        public int hashCode() { return word.hashCode(); }

        @Override
        public boolean equals(Object obj) { return word.equals(((Word)obj).word); }

        @Override
        public int compareTo(Word b) { return b.count - count; }
    }

        private static void print (Map<String, Word> countMap) {

            List<Word> sWords = new ArrayList<>(countMap.values());

            for (Word word : sWords) {
                System.out.println(word.count + "\t" + word.word); }
        }

        public static void run () {
            try {
                WordStat.print(WordStat.countWord(WordStat.input()));
            } catch (IOException e) {
                throw new RuntimeException(e);}
        }
    }
