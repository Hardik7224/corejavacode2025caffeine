package section6_Iterative_statements;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // GCD of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // using while loop
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("GCD = " + a);

        /* using for loop
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        System.out.println("GCD = " + gcd);
        */
    }
}