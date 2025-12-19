package section8_Introduction_to_Arrays;

public class Example11 {
    public static void main(String[] args) {
        // Manual Hashing (Array as Hash Table)
        int[] arr = {2, 5, 7, 10};
        int max = 10;

        int[] hash = new int[max + 1];

        // hashing
        for (int x : arr) {
            hash[x] = 1;
        }

        int key = 7;

        if (hash[key] == 1)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}