package section8_Introduction_to_Arrays;

public class Example16 {
    public static void main(String[] args) {
        // Combining two arrays
        int [] A = {7,31,15,9,17,2};
        int [] B = {4,2,1,5,8};
        int [] C = new int[A.length + B.length];
        int k=0;

        // Storing A in C
        for(int i=0;i<A.length;i++){
            C[k] = A[i];
            k++;
        }
        // Storing B in C
        for(int i=0;i<B.length;i++){
            C[k]=B[i];
            k++;
        }
        // Printing C
        System.out.println("Array C is:");
        for(int i=0;i<C.length;i++){
            System.out.print(C[i] + " ");
        }

    }
}