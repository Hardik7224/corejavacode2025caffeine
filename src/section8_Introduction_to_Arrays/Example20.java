package section8_Introduction_to_Arrays;

public class Example20 {
    public static void main(String[] args) {
        // Count the numbers of 0's,1's,2's
        int [] A = {0,1,0,2,1,0,0,2,1};
        int zeros=0;
        int ones=0;
        int twos=0;

        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                zeros++;
            } else if (A[i]==1) {
                ones++;
            }
            else{
                twos++;
            }
        }
        System.out.println("Count of 0 in array: " + zeros);
        System.out.println("Count of 1 in array: " + ones);
        System.out.println("Count of 2 in array: " + twos);
    }
}