package section6_Iterative_statements;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        // Reverse of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reversed number = " + rev);
    }
}