package HackerRank_Solutions.Week_1;

import java.io.*;
import java.util.*;


class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as a parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
     double pos = 0, neg = 0, zero = 0;
        for (Integer number : arr) {
            if(number < 0)
                neg++;
            if(number > 0)
                pos++;
            if(number == 0)
                zero++;
        }
        System.out.printf("%.6f%n", pos / arr.size());
        System.out.printf("%.6f%n", neg / arr.size());
        System.out.printf("%.6f%n", zero / arr.size());
    }

}

class plusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
