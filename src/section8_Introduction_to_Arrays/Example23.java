package section8_Introduction_to_Arrays;

// Subarray -> A subarray is a continuous part of an array.
//            Ex : int[] arr = {1, 2, 3}; 
//                 [1, 2] is a subarray of [1,2,3]

public class Example23 {
    public static void main(String[] args) {
        // Print All Subarrays
        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                // print subarray from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}