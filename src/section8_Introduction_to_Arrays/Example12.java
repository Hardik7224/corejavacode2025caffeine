package section8_Introduction_to_Arrays;

public class Example12 {
    public static void main(String[] args) {
        // Count of duplicate digits in an array
        int [] nums ={1,3,3,1,2};
        int [] hash =new int[4];

        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }

        for(int i=0;i<hash.length;i++){
            if(hash[i]>1){
                System.out.println("Duplicate digit: " + i);
                System.out.println("Element(" +i +") : Frequency("+ hash[i] +")");
            }
        }

    }
}