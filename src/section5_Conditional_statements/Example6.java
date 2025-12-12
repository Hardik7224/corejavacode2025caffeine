package section5_Conditional_statements;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        //  Basic Ternary Operator - (Adult or Minor)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int age = sc.nextInt();

        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Result: " + result);
    }
}