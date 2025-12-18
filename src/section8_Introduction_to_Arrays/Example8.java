package section8_Introduction_to_Arrays;

public class Example8 {
    public static void main(String[] args) {

        // Initializing and printing array
        int [] nums={1,2,3,5,6,7,8,9,10};
        System.out.println("Array is:");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Finding missing number in an array of natural numbers
        int n= nums.length + 1;
        int sum =0;
        for(int i=0;i< nums.length;i++){
            sum = sum + nums[i];
        }
        int secondSum = (n*(n + 1))/2;
        int missingNumber = secondSum - sum ;
        System.out.println("Missing number is: " + missingNumber);

    }
}