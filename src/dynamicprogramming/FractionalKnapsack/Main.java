package dynamicprogramming.FractionalKnapsack;

public class Main {
    public static void main(String[] args) {

        FractionalKnapsack obj = new FractionalKnapsack();

        int[] A = {60, 100, 120};
        int[] B = {10, 20, 30};
        int C = 50;

        int ans = obj.solve(A, B, C);

        System.out.println(ans);
    }
}