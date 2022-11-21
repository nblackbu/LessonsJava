import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Reverse {


    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
//        List<String> numbers = new ArrayList<>();
//        String[] w = s.split(" ");
//        int[] m = new int[1000000];
//        for (int i = 0; i <= w.length;i++) {
//            m[i] = Integer.parseInt(w[i]);
//        }
//        for (int r = m.length - 1; r >= 0; r--) {
//            System.out.println(m[r]);
//        }
//    }
//}
        List<String> input = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = reader.readLine();
            String[] words = StringUtils.split(s);
            String reverse = new StringBuffer(s).reverse().toString();
            if(s.equals(""))break;
            input.add(reverse);
        }

        for (int i = input.size() - 1; i < input.size(); i--){
            System.out.println(input.get(i));
        }


    }
}