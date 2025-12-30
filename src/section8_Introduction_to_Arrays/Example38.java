package section8_Introduction_to_Arrays;

public class Example38 {
    public static void main(String[] args) {
        // Remove duplicates from an array
        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        int j = 0; // slow pointer

        for (int i = 1; i < arr.length; i++) { // fast pointer
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        int uniqueCount = j + 1;

        System.out.println("Unique count: " + uniqueCount);
        System.out.println("Array becomes:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}