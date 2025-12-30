package section8_Introduction_to_Arrays;

/*
Equilibrium Index -> An equilibrium index is an index i in an array such that:
                  -> Sum of elements to the left of i = Sum of elements to the right of i

 Rules->  If entered array is:
         Empty array → No equilibrium
         Single element → Index 0 is equilibrium
         All zeros → Every index is equilibrium
*/

public class Example37 {
    public static void main(String[] args) {
        // Equilibrium Index
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println("Equilibrium Index: " + i);
            }

            leftSum += arr[i];
        }
    }
}