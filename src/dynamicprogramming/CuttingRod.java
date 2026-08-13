package dynamicprogramming;

import java.util.Arrays;

public class CuttingRod {
    private int[] dp; // memoization array
    public int solve(int[] A) {
        int N = A.length;

        dp = new int[N + 1];

        Arrays.fill(dp, -1);

        return CR(A, N);
    }
    private int CR(int[] A, int length){
        if(length==0){
            return 0;
        }
        if(dp[length]!=-1){
            return dp[length];
        }
        int maxVal= A[length-1];
        for(int l=1; l<=length-1; l++){
            int val=A[l-1]+CR(A, length-l);
            maxVal=Math.max(val, maxVal);
        }
        dp[length]=maxVal;
        return  maxVal;
    }

}
