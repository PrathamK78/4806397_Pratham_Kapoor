package HackerRank_Solutions.Week_2;

import java.io.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'counterGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String counterGame(long n) {
    // Write your code here
        if (n == 1) return "Richard";

        int turn = 0;
        while (n > 1) {
        if ((n & (n - 1)) == 0) { // Check if n is a power of two
            n /= 2;
        } else {
            n -= Long.highestOneBit(n); // Get the largest power of 2 less than or equal to n
        }
        turn++;
        }
        return (turn % 2 == 0) ? "Richard" : "Louise";
    }

}

public class CounterGame {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                String result = Result.counterGame(n);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
