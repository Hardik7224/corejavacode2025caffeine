package section8_Introduction_to_Arrays;

public class Example6 {
    public static void main(String[] args) {
        // Initializing and printing array
        int[] arr = {2, 4, 5, 8, 10};
        System.out.println("Array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Count even and odd elements in array
        int even = 0, odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Total Even elements: "+ even);
        System.out.println("Total Odd elements: "+ odd);
    }
}