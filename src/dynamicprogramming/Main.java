package dynamicprogramming;

public class Main {
    public static void main(String[] args) {

        int[] prices = {1, 5, 8, 9};

        CuttingRod cuttingRod = new CuttingRod();

        int result = cuttingRod.solve(prices);

        System.out.println("Maximum value = " + result);
    }
}