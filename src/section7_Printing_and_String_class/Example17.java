package section7_Printing_and_String_class;

public class Example17 {
    public static void main(String[] args) {
        // Print duplicate characters
        String s = "programming";
        s = s.toLowerCase();

        System.out.println("Duplicate characters:");

        for (int i = 0; i < s.length(); i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            // Print only first occurrence
            if (isDuplicate && s.indexOf(s.charAt(i)) == i) {
                System.out.println(s.charAt(i));
            }
        }
    }
}