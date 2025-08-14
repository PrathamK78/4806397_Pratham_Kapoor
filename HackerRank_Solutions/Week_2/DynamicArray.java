package HackerRank_Solutions.Week_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();
        int lastAnswer = 0;

        // Initialize the 2D array with n empty lists of Integer
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<Integer>());
        }

        for (List<Integer> query : queries) {
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int idx = (x ^ lastAnswer) % n;

            if (type == 1) {
                arr.get(idx).add(y);
            } else if (type == 2) {
                List<Integer> seq = arr.get(idx);
                lastAnswer = seq.get(y % seq.size());
                answers.add(lastAnswer);
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();       // Number of sequences
        int q = scanner.nextInt();       // Number of queries
        scanner.nextLine();              // Consume remaining newline

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] parts = scanner.nextLine().split(" ");
            List<Integer> query = new ArrayList<>();
            for (String part : parts) {
                query.add(Integer.parseInt(part));
            }
            queries.add(query);
        }

        List<Integer> result = dynamicArray(n, queries);
        for (int answer : result) {
            System.out.println(answer);
        }

        scanner.close();
    }
}
