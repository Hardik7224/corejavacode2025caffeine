package section2_Datatypes_variables_and_literals;

public class Example11
{
    public static void main(String[] args)
    {
        // Type Conversion

        // 1.Example On Numerical Type

        // Example On Narrowing
        int num1 = 12;
        System.out.println(num1);

        byte bNum1 = (byte) num1;
        System.out.println(bNum1);

        // Example On Widening
        int num2 = 122222;
        System.out.println(num2);

        long num3 = num2;
        System.out.println(num3);

        // 2.Example On Decimal Type

        // Example On Narrowing
        double ldValue1 = 12.1234567890123456; // 16 Decimal Places
        System.out.println(ldValue1);

        float lfValue1 = (float) ldValue1;   // Narrowing
        System.out.println(lfValue1);

        // Example On Widening
        float lfValue2 = 12.1234f;
        System.out.println(lfValue2);

        double ldValue2 = lfValue2;
        System.out.println(ldValue2);

        // 3.Example On Character Type

        // Example On Narrowing
        int myNumber = 97;
        System.out.println(myNumber);

        char myLetter = (char)myNumber;
        System.out.println(myLetter);

        // Example On Widening
        char c = 'A';
        System.out.println(c);

        int ascii = c;
        System.out.println(ascii);

    }
}
