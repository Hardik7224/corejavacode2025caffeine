package section6_Iterative_statements;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        // Factorial of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
        sc.close();
    }
}