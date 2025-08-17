package HackerRank_Solutions.Week_2;

import java.io.*;


class Result {

    /*
     * Complete the 'sumXor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long sumXor(long n) {
    // Write your code here
        if(n == 0) return 1 ;
        
        int totalOneBits = Long.bitCount(n) ;
        int totalBits = Long.toBinaryString(n).length() ;
        int zeroBits = totalBits - totalOneBits ;
         
        return 1l << zeroBits ; //bitwise left shift => 8 4 2 1 ;power of 2

    }

}

public class SumVsXor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.sumXor(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

