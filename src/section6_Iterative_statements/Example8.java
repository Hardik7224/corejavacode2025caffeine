package section6_Iterative_statements;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        // Multiplication table of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        sc.close();
    }
}