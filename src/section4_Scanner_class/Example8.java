package section4_Scanner_class;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Input.useRadix(16);

        int a;
        System.out.println("Enter the value a using radix 16 : ");
        a = Input.nextInt();

        System.out.println(a); // Decimal Number
        System.out.println(Integer.toBinaryString(a)); // Binary Number
        System.out.println(Integer.toOctalString(a)); // Octal
        System.out.println(Integer.toHexString(a));  // Hexadecimal

    }
}