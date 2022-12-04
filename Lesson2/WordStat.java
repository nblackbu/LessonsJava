package Lesson2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;

public class WordStat {
    public static void run() {
            String str = InputTextToFile.input();
            Map<String, CountWord.Word> countMap = CountWord.countWord(str);
            PrintText.print(countMap);
        }
    }
