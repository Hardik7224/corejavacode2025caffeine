package section5_Conditional_statements;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        // Nested if-else statement - Grade evaluation
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks >= 35) {
            System.out.println("Result: Pass");

            if (marks >= 60) {
                System.out.println("Grade: First Class");

                if (marks >= 85) {
                    System.out.println("Distinction Achieved!");
                }
            }

            else {
                System.out.println("Grade: Second Class");
            }
        }

        else {
            System.out.println("Result: Fail");
        }
        sc.close();
    }
}