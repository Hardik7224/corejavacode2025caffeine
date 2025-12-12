package section6_Iterative_statements;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        // log base 2 of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int log = 0;
        while (n > 1) {
            n = n / 2;
            log++;
        }
        System.out.println("log2 value = " + log);
    }
}