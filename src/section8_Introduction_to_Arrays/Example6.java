package section8_Introduction_to_Arrays;
import java.util.Arrays;
public class Example6 {
    public static void main(String[] args){
        // Reversing array elements
        int[] nums      = {1,2,3,4,5,6,7,8,9};
        int[] revNums   = new int[nums.length];

        int size = nums.length;

        for(int i =0; i < revNums.length; i++)
        {
            revNums[i] = nums[size-1-i];
        }

        System.out.println("Array Elements After Reverse Copying");
        System.out.print(Arrays.toString(revNums));

    }
}