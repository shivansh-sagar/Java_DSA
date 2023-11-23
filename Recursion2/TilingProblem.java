package Recursion2;

public class TilingProblem {
    public static int tilingProb(int n) {// 2x n (floor size)
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // verticle
        int fnm1 = tilingProb(n - 1);

        // Horizontal
        int fnm2 = tilingProb(n - 2);

        // totalWays
        int totalways = fnm1 + fnm2;
        return totalways;
    }

    public static void main(String[] args) {
        int n=7;
        System.out.println(tilingProb(n));
    }
}
