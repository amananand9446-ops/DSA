package dynamicprogramming;

public class Main2 {

    public static void main(String[] args) {

        CoinSumInfinite solution = new CoinSumInfinite();

        int[] A = {1, 2, 3};
        int B = 4;

        System.out.println(solution.coinchange2(A, B));
    }
}
