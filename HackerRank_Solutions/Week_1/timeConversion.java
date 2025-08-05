package HackerRank_Solutions.Week_1;

import java.io.*;
import java.text.*;
import java.util.*;


class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    DateFormat hour_12 = new SimpleDateFormat("hh:mm:ssa");  // Note: no space before AM/PM
    DateFormat hour_24 = new SimpleDateFormat("HH:mm:ss");
    Date time;
    String answer = "";

    try {
        time = hour_12.parse(s);
        answer = hour_24.format(time);
    } catch (ParseException e) {
        e.printStackTrace();
    }

    return answer;
    
    }


}

public class timeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

