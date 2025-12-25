package section6_Iterative_statements;
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        // Check whether the number is prime or composite
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is neither prime nor composite");
        }
        else {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is a composite number");
            }
        }

        sc.close();
    }
}