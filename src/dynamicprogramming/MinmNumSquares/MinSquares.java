package dynamicprogramming.MinmNumSquares;

import java.util.Arrays;

public class MinSquares {

    int[] dp;

    public int solve(int A) {

        dp = new int[A + 1];

        Arrays.fill(dp, -1);

        return minSquares(A);
    }

    public int minSquares(int A) {

        // Base case
        if (A == 0) {
            return 0;
        }

        // Already calculated
        if (dp[A] != -1) {
            return dp[A];
        }

        int ans = Integer.MAX_VALUE;

        // Try every possible square
        for (int i = 1; i * i <= A; i++) {

            int square = i * i;

            int count = 1 + minSquares(A - square);

            ans = Math.min(ans, count);
        }

        dp[A] = ans;

        return dp[A];
    }
}