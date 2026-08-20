package dynamicprogramming.knapsack;

public class Main3 {
    public static void main(String[] args) {

        ZeroOneKnapsack obj = new ZeroOneKnapsack();

        int[] A = {60, 100, 120};
        int[] B = {10, 20, 30};
        int C = 50;

        int ans = obj.solve(A, B, C);

        System.out.println(ans);
    }
}