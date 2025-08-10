package HackerRank_Solutions.Week_2;

public class SalesByMatch {
    public static int sockMerchant(int n, int[] ar) {
        int[] colorCount = new int[101]; // Assuming sock colors are in the range 1 to 100
        for (int i = 0; i < n; i++) {
            colorCount[ar[i]]++;
        }

        int pairs = 0;
        for (int count : colorCount) {
            pairs += count / 2; // Each pair consists of two socks
        }
        
        return pairs;
    }
        
}
