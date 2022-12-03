package Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Reverse {
    private static List<String> input() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> numbers = new ArrayList<>();

        while(true) {
            String s = null;
            try {s = reader.readLine();}
            catch (IOException e) {System.out.println(e.getMessage());}
            if(s.equals(""))break;
            numbers.add(s);
        }
        return numbers;
    }

    private static List<int[]> convector(List<String> stringList) {

        List<int[]> intList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        for (int m = 0; m < stringList.size(); m++) {
            String s = stringList.get(m);
            String strArr[] = s.split(" ");
            int numArr[] = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++)
            {
                numArr[i] = Integer.parseInt(strArr[i]);
            }
            intList.add(numArr);
        }
        return intList;
    }

    private static List<int[]> reverse(List<int[]> intList) {
        List<int[]> reverse = new ArrayList<>();
        List<int[]> reverse2 = new ArrayList<>();

        for (int[] array : intList) {
            int[] arrInt = new int[array.length];
            for (int j = array.length - 1; j > 0;) {
                for (int h = 0; h < array.length; h++) {
                    arrInt[h] = array[j];
                    j--;
                }
            }
            reverse2.add(arrInt);
        }

        for (int i = reverse2.size() - 1; i >= 0; i--)
        {
            reverse.add(reverse2.get(i));
        }
        return reverse2;
    }

    private static void print(List<int[]> printList) {
        for (int[] array : printList)
        {
            for (int x : array)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void run() {
        Reverse.print(Reverse.reverse(Reverse.convector(Reverse.input())));
    }
}
