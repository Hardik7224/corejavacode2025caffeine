package section6_Iterative_statements;
import java.util.Scanner;

public class Example2 {
    // Count digits of a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Total digits = " + count);
    }
}