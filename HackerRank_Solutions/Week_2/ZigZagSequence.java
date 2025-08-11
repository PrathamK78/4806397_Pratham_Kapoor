package HackerRank_Solutions.Week_2;

import java.util.*;

public class ZigZagSequence {

    public static void findZigZagSequence(int[] a, int n) {
        Arrays.sort(a);  // 1st line correct

        int mid = (n - 1) / 2;
        // 1st Modification: swap a[mid] and a[n-1] instead of a[mid] and a[mid+1]
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        // 2nd Modification: start = mid + 1 instead of mid + 1
        int st = mid + 1;
        int ed = n - 2;

        // 3rd Modification: condition should be st <= ed, not st < ed
        while (st <= ed) {
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i != n - 1)
                System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            findZigZagSequence(a, n);
        }
        sc.close();
    }
}

