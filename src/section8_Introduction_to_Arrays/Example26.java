package section8_Introduction_to_Arrays;

public class Example26 {
    public static void main(String[] args) {
        // Maximum Subarray Sum (Kadane's Algorithm)
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int start = 0;      // temp start
        int end = 0;        // final end
        int tempStart = 0;  // temp start index

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.print("Subarray = ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}