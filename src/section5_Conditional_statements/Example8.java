package section5_Conditional_statements;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        // Check whether the number is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println(num + " is an even number");
        }
        else{
            System.out.println(num + " is an odd number");
        }
        sc.close();

    }
}