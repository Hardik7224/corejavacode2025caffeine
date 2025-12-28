package section8_Introduction_to_Arrays;

public class Example35 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 3, 2};
        int majority = 0;
        int count = 0;

        // Majority Element
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                majority = arr[i];
            }

            if (arr[i] == majority) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println("Majority Element: " + majority);

        // Frequency of majority element
        int freq = 0;
        for (int x : arr) {
            if (x == majority) {
                freq++;
            }
        }
        System.out.println("Frequency of " + majority + ": " + freq);

    }
}
