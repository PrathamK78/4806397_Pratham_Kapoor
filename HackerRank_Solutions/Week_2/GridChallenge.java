package HackerRank_Solutions.Week_2;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
    // Write your code here
        for (int i = 0; i < grid.size(); i++) {
            char[] charArray = grid.get(i).toCharArray();
            Arrays.sort(charArray);
            grid.set(i, new String(charArray));
        }
        for (int i = 0; i < grid.get(0).length(); i++) {
            for (int j = 0; j < grid.size()-1; j++) {
                if (grid.get(j).charAt(i) > grid.get(j+1).charAt(i)){
                    return "NO";
                }
            }
        }
        return "YES";
    }

}

public class GridChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> grid = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String gridItem = bufferedReader.readLine();
                grid.add(gridItem);
            }

            String result = Result.gridChallenge(grid);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

