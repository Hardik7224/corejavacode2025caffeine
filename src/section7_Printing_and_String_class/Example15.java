package section7_Printing_and_String_class;

public class Example15 {
    public static void main(String[] args) {
        // Check whether a string is palindrome or not
        String s = "madam";
        boolean isPalindrome = true;
        s = s.toLowerCase();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}