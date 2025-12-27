package section8_Introduction_to_Arrays;

public class Example30 {
    public static void main(String[] args) {
        // Range Sum Query (Prefix Sum)
        int[] A = {3, 6, 2, 8, 9, 4};

        // Build prefix sum array
        int[] prefix = new int[A.length];
        prefix[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }

        // Query: sum from index L to R
        int L = 1, R = 4;
        int sum;

        if (L == 0) {
            sum = prefix[R];
        } else {
            sum = prefix[R] - prefix[L - 1];
        }

        System.out.println("Sum = " + sum);
    }
}