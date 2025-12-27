package section8_Introduction_to_Arrays;
// Understanding LB , UB , Floor and Ceil using Binary Search
public class Example31 {
    // Lower Bound: first index with value >= key
    static int lowerBound(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= key) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // Upper Bound: first index with value > key
    static int upperBound(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > key) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // Floor: greatest element <= key
    static int floor(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= key) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Ceil: smallest element >= key
    static int ceil(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= key) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 7};
        int key = 3;

        System.out.println("Lower Bound index: " + lowerBound(arr, key));
        System.out.println("Upper Bound index: " + upperBound(arr, key));
        System.out.println("Floor value: " + floor(arr, key));
        System.out.println("Ceil value: " + ceil(arr, key));

    }
}