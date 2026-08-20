package dynamicprogramming.knapsack;

public class ZeroOneKnapsack {
    int[][] dp;

    public int solve(int[] A, int[] B, int C) {
        int n = A.length;

        dp = new int[n][C + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= C; j++) {
                dp[i][j] = -1;
            }
        }

        return knapsack(n - 1, C, A, B);
    }

    public int knapsack(int i, int cap, int[] A, int[] B) {
        if (i < 0 || cap <= 0) {
            return 0;
        }

        if (dp[i][cap] != -1) {
            return dp[i][cap];
        }

        int reject = knapsack(i - 1, cap, A, B);

        int select = 0;
        if (B[i] <= cap) {
            select = A[i] + knapsack(i - 1, cap - B[i], A, B);
        }

        dp[i][cap] = Math.max(select, reject);

        return dp[i][cap];
    }
}