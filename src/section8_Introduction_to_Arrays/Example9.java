package section8_Introduction_to_Arrays;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        // Linear Search Algorithm
        int [] arr = {2,7,1,8,3,11};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key element to be found:");
        int key = sc.nextInt();
        int index =-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("Element " + key +" is found at index " + index);
        }
        else{
            System.out.println("Element " + key + " is not found");
        }
    }
}