package section8_Introduction_to_Arrays;

public class Example14 {
    public static void main(String[] args) {
        int [] arr ={12, 35, 1, 10, 34};
        int largest=arr[0];
        int secondLargest = Integer.MIN_VALUE ;  // if contain negative numbers

        // find largest
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element is: " + largest);

        // find secondLargest
        for(int i=0;i<arr.length;i++){
            if(arr[i] != largest){
                if(secondLargest ==-1 || arr[i]>secondLargest){
                    secondLargest = arr[i];
                }
            }
        }
        System.out.println("Second largest element is " + secondLargest);
    }
}