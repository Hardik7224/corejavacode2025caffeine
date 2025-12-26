package section8_Introduction_to_Arrays;
// Permutation Array -> A permutation array is an array that contains all numbers from 0 to n-1 exactly once.

public class Example28 {
    public static void main(String[] args){
        // Build array from permutation

        int [] A={1,0,2,3,4,5};  // permutation array
        int [] B = new int[A.length];  // build array

        for(int i=0;i<A.length;i++){
            B[i] = A[A[i]];
        }
        // Printing the result array
        for(int i=0;i<B.length;i++){
            System.out.print(B[i] + " ");
        }

    }
}