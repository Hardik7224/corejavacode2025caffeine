package section6_Iterative_statements;
import java.util.Scanner;

public class Example0 {
    public static void main(String[] args) {
        // LCM of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter second number:");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;

        // using while loop
        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is " + max);
                break;
            }
            max++;
        }
        /* using for loop
        for (int i = max; ; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is " + i);
                break;
            }
        }
         */
        sc.close();
    }
}