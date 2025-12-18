package section8_Introduction_to_Arrays;
import java.util.Arrays;

public class Example4 {
    //Traversing array elements
    public static void main(String[] args)
    {
        int[] nums = new int[]{10,20,30,40};

        //Printing using println function
        System.out.println("Array elements are: ");
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);

        //Printing using traditional for loop
        System.out.println("Array elements are: ");
        for(int i=0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }

        //Printing using for each loop
        System.out.println("Array elements are: ");
        for(int x:nums){
            System.out.println(x);
        }

        //Printing using Array's toString method
        System.out.println("Array elements are: ");
        System.out.println(Arrays.toString(nums));

    }
}