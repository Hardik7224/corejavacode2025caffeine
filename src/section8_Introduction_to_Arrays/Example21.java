package section8_Introduction_to_Arrays;

public class Example21 {
    public static void main(String[] args) {
        // Character array
        char[] arr = {'J', 'a', 'v', 'a'};

        // Character array to string
        String s = new String(arr);
        //Displaying result
        System.out.println("String is:"+ "\n" + s);

        // String to character array
        String s1 = "Hello";
        char[] arr1 = s1.toCharArray();
        //Displaying result
        System.out.println("Array is:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }

    }
}