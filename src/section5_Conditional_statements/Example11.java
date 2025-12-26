package section5_Conditional_statements;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        // Calculator
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Choose an operator (+, -, *, /):");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero is not allowed");
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}