package HackerRank_Solutions.Week_1;

import java.util.*;

public class XorStrings2 {

    public static String stringsXOR(String s, String t) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == t.charAt(index)) {
                result.append('0');
            } else {
                result.append('1');
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));
        in.close();
    }

}




