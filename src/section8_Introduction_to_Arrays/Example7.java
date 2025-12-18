package section8_Introduction_to_Arrays;

public class Example7 {
    public static void main(String[] args) {
        // Initializing and printing array
        int [] arr={2,4,6,8,10};
        System.out.println("Array is:");
        for(int x:arr){
            System.out.print(x + " ");
        }
        System.out.println();

        // Sum of all elements in array
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements is : " + sum);
    }
}