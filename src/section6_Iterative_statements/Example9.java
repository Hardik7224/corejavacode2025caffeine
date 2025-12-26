package section6_Iterative_statements;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        // Understanding do-while loop
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();
        } while (num <= 0);
        System.out.println("You entered: " + num);

        sc.close();
    }
}