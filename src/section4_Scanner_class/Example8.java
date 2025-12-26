package section4_Scanner_class;
import java.util.Scanner;
//How to read character value from keyboard
public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println("You entered: " + ch);
    }
}