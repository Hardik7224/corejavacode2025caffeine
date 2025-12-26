package section8_Introduction_to_Arrays;

public class Example24 {
    public static void main(String[] args) {
        // Count of total Subarrays
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        int totalSubarrays = n * (n + 1) / 2;

        System.out.println("Total Subarrays = " + totalSubarrays);
    }
}