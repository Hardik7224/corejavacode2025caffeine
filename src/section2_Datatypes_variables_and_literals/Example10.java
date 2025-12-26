package section2_Datatypes_variables_and_literals;

public class Example10
{
    public static void main(String[] args)
    {
        // More Information on Character Data Type
        char c = 'A';
        System.out.println(c);

        char c1 = 65;
        System.out.println(c1);

        int x = 'A';
        System.out.println(x);

        // Character Supports Unicode
        char someOtherCharacter = '\u1278';
        System.out.println(someOtherCharacter);

        // Wrapper Class Method On Character Value
        char c2 = 'G';
        char c3 = '6';

        System.out.println(Character.isDigit(c2));
        System.out.println(Character.isLetter(c2));

        System.out.println(Character.isDigit(c3));
        System.out.println(Character.isLetter(c3));

        char c4 = ' ';
        System.out.println(Character.isSpaceChar(c4));
        System.out.println(Character.isSpaceChar(c3));
    }
}
