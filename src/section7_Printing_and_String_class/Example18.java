package section7_Printing_and_String_class;

public class Example18 {
    public static void main(String[] args) {
        // Remove duplicate characters
        String s = "programming";
        s = s.toLowerCase();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}