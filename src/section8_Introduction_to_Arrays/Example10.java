package section8_Introduction_to_Arrays;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        // Binary Search Algorithm
        int [] arr = {2,5,7,11,14,18};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key element to be found:");
        int key = sc.nextInt();

        int LB=0;
        int UB=arr.length - 1;
        int index =-1;
        while(LB<=UB){
            int mid = (LB + UB)/2;
            if (arr[mid] == key){
                index = mid;
                break;
            } else if (key<arr[mid]) {
                UB = mid-1;
            }
            else{
                LB = mid+1;
            }
        }
        if(index != -1){
            System.out.println("Element " + key + " is found at index " + index);
        }
        else{
            System.out.println("Element " + key + " is not found");
        }
    }
}