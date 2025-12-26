package section5_Conditional_statements;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        // Else-if ladder - Age group classification
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age entered!");
        }
        else if (age < 13) {
            System.out.println("You are a Child");
        }
        else if (age < 20) {
            System.out.println("You are a Teenager");
        }
        else if (age < 60) {
            System.out.println("You are an Adult");
        }
        else {
            System.out.println("You are a Senior Citizen");
        }
        sc.close();
    }
}