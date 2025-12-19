package section8_Introduction_to_Arrays;

public class Example15 {
    public static void main(String[] args) {
        int [] arr ={12, 35, 1, 10, 34};
        int smallest=arr[0];
        int secondSmallest=-1;
        // int secondSmallest = Integer.MAX_VALUE ;  // if contain negative numbers

        // find smallest
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element is: " + smallest);

        // find secondSmallest
        for(int i=0;i<arr.length;i++){
            if(arr[i] != smallest){
                if(secondSmallest ==-1 || arr[i]<secondSmallest){
                    secondSmallest = arr[i];
                }
            }
        }
        System.out.println("Second smallest element is: " + secondSmallest);
    }
}