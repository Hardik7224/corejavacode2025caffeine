package section5_Conditional_statements;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        // If-else selection statement - Check Even/Odd
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println(x + " is Even.");
        } else {
            System.out.println(x + " is Odd.");
        }

        System.out.println("Program Finished.");
    }
}