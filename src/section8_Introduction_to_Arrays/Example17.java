package section8_Introduction_to_Arrays;

public class Example17 {
    public static void main(String[] args) {
        // Reverse copy of an array
        int [] A = {7,31,15,9,17,2};
        int [] B = new int[A.length];

        // Storing A's reverse order in B
        for(int i=A.length-1;i>=0;i--){
            B[B.length-1-i] = A[i];
        }

        //Printing B
        System.out.println("Array B is:");
        for(int i=0;i<B.length;i++){
            System.out.print(B[i] + " ");
        }

    }
}