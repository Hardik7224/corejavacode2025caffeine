package section5_Conditional_statements;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args){
        // Switch case selection statement - Weekdays
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1–7): ");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Monday");
                break;
            //case 1 -> System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid week day");
        }
    }
}