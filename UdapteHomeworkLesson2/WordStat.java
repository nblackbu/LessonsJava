package UdapteHomeworkLesson2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class WordStat {

    private static String input() {

        String path = "/Users/админ/Desktop/test.txt";
        String stringWord = null;
        List<String> strList = new ArrayList<>();

        try {
            stringWord = Files.readString(Paths.get(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringWord.toLowerCase();
    }

    private static Map<String, Integer> mapWord (String stringWord) {

        Pattern pattern1 = Pattern.compile("([?!,. :])");
        Map<String, Integer> mapW = new LinkedHashMap<>();
        String[] strSpilt = stringWord.split(String.valueOf(pattern1));

        int count = 0;
        for (int i = 0; i < strSpilt.length; i++) {
            count = 0;
            for (int j = 0; j < strSpilt.length; j++) {
                if (strSpilt[i].equals(strSpilt[j])) {
                    count++;
                }
            }
            mapW.put(strSpilt[i], count);
        }
        System.out.println(mapW);
        return mapW;
    }

    public static void writeFile(Map<String, Integer> mapW) throws IOException {

        File file = new File("testFile.txt");
        FileWriter writer = new FileWriter("testFile.txt");
        String str = mapW.toString();
        String[] str1 = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            writer.write(str1[i]);
        } writer.flush();
        writer.close();
    }

    public static void run() throws IOException {
        WordStat.writeFile(WordStat.mapWord(WordStat.input()));
    }
}
