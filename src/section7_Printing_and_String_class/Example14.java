package section7_Printing_and_String_class;

public class Example14 {
    public static void main(String[] args) {
        // Reversing a string
        String s = "Hello";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

    }
}