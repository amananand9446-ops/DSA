package dynamicprogramming.FractionalKnapsack;


import java.util.Arrays;

public class FractionalKnapsack {

    static class Item {
        int value;
        int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public int solve(int[] A, int[] B, int C) {

        int n = A.length;

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(A[i], B[i]);
        }

        Arrays.sort(items, (a, b) ->
                Double.compare(
                        (double) b.value / b.weight,
                        (double) a.value / a.weight
                )
        );

        double ans = 0;
        int capacity = C;

        for (Item item : items) {

            if (item.weight <= capacity) {
                ans += item.value;
                capacity -= item.weight;
            } else {
                ans += ((double) item.value / item.weight) * capacity;
                break;
            }
        }

        return (int) Math.floor(ans * 100);
    }
}
