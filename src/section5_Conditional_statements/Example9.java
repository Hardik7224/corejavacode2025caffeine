package section5_Conditional_statements;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        // Voting Eligibility

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }

        sc.close();
    }
}