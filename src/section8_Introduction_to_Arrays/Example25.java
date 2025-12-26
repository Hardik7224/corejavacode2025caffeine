package section8_Introduction_to_Arrays;

public class Example25 {
    public static void main(String[] args) {
        // Subarray with given sum = k
        int[] arr = {1, 2, 3, 7, 5};
        int k = 12;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == k) {
                    System.out.print("Subarray: ");
                    for (int x = i; x <= j; x++) {
                        System.out.print(arr[x] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}