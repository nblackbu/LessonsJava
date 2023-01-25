package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {

//    public static List<LineItem> lines = new ArrayList<>();

    public static Solution arrStr(String[] paths) {

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        Constants s = Constants.SAME;
        String same = s.getConstants();
        Constants a = Constants.ADDED;
        String added = a.getConstants();
        Constants r = Constants.REMOVED;
        String removed = r.getConstants();

        try (BufferedReader buff = new BufferedReader(new FileReader(paths[0]))) {
            while (buff.ready()) {
                arr1.add(buff.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader buff2 = new BufferedReader(new FileReader(paths[1]))) {
            while ((buff2.ready())) {
                arr2.add(buff2.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                if (arr1.get(i).equals(arr2.get(j)) == true) {
                    result.add(same + arr1.get(i));
                }
            }
        }
        System.out.println(result);
        return null;
    }

            class LineItem {
            }
}
