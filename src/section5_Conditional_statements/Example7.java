package section5_Conditional_statements;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        // Nested Ternary Operator - Check Positive, Negative, or Zero

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        String result = (x > 0) ? "Positive"
                        : (x < 0) ? "Negative"
                        : "Zero";

        System.out.println("Number is: " + result);
        sc.close();
    }
}