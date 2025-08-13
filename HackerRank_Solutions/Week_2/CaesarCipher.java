package HackerRank_Solutions.Week_2;

import java.io.*;

class Result1 {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if ( c >= 'a' && c<='z'){
                c = (char) ('a' + ( c- 'a' + k) % 26);
            }else if (c >= 'A' && c<='Z'){
                c = (char) ('A' + ( c- 'A' + k) % 26);
            }
            sb.append(c);
        }
        return sb.toString();
    }

}

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

                bufferedReader.readLine().trim();

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result1.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
