package section4_Scanner_class;
import java.util.Scanner;
//How to read string value from keyboard
public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("You entered: " + str);
    }
}