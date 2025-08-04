package HackerRank_Solutions.Week_1;

import java.io.*;
import java.util.*;

class Result1 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as a parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long min=0;
        for(int i=0;i<arr.size()-1;i++){
            min=arr.get(i)+min;
        }
        long max=0;
        for(int i=arr.size()-1;i>0;i--){
            max=arr.get(i)+max;
        }

        System.out.println(min+" "+max);
    }

}

class min_max_sum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result1.miniMaxSum(arr);

        bufferedReader.close();
    }
}

