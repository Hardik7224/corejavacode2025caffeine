package section5_Conditional_statements;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        // Check whether the year is leap year or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
        sc.close();

    }
}