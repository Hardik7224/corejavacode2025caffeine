package section8_Introduction_to_Arrays;

public class Example27 {
    public static void main(String[] args) {
        // Maximum Subarray Product
        int[] arr = {2, 3, -2, 4};

        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        int start = 0, end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {

            // If current element is negative, swap
            if (arr[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Decide whether to start new subarray or continue
            if (arr[i] > maxProduct * arr[i]) {
                maxProduct = arr[i];
                tempStart = i;
            } else {
                maxProduct = maxProduct * arr[i];
            }

            minProduct = Math.min(arr[i], minProduct * arr[i]);

            // Update result
            if (maxProduct > result) {
                result = maxProduct;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum Product = " + result);
        System.out.print("Subarray = ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}