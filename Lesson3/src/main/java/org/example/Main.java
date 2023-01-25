package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String[] paths = new String[2];
        
        try {
            paths[0] = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            paths[1] = reader2.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Solution.arrStr(paths);
    }
}
