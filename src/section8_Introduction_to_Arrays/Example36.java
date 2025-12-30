package section8_Introduction_to_Arrays;

public class Example36 {
    // Two Sum Problem (Brute force approach)
    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};   // return indices
                }
            }
        }
        return new int[]{-1, -1}; // if no solution
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

}