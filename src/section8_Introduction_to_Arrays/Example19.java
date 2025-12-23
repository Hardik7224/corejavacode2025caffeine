package section8_Introduction_to_Arrays;

public class Example19 {
    public static void main(String[] args) {
        // Maximum Consecutive Ones
        int [] A = {1,1,0,0,1,1,1,0};
        int count =0;
        int max=0;

        for(int i=0;i<A.length;i++){
            if(A[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        System.out.println("Maximum consecutive ones in array is: " + max);
    }
}