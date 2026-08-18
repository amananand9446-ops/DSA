package dynamicprogramming;

public class CoinSumInfinite {
public int coinchange2(int[] A, int B) {
    return countChange2(A, B, 0);
}

public int countChange2(int[] A, int n, int lui) {

    if (n == 0) {
        return 1;
    }

    if (n < 0) {
        return 0;
    }

    int ways = 0;

    for (int i = lui; i < A.length; i++) {

        int coin = A[i];

        int answer = countChange2(A, n - coin, i);

        ways = ways + answer;
    }

    return ways;
}
}