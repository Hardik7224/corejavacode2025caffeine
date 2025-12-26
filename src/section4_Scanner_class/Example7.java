package section4_Scanner_class;
import java.util.Scanner;
//How to read boolean value from keyboard
public class Example7 {
        public static void main(String[] args)
        {
            Scanner Input = new Scanner(System.in);
            boolean b1;

            System.out.println("Enter the boolean value : ");
            b1 = Input.nextBoolean();

            System.out.println("The Value of Boolean B1 : " + b1);
        }
    }