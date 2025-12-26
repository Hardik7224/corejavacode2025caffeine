package section5_Conditional_statements;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        // If selection statement - Check if number is negative
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("The number is Negative.");
        }

        System.out.println("Program Finished.");
        sc.close();
    }
}