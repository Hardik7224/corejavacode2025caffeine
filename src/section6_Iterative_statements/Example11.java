package section6_Iterative_statements;

// Palindrome Number -> Number reads the same forwards and backwards.
//                      Ex: 1331 -> 1331

public class Example11 {
    public static void main(String[] args) {
        // Palindrome Number
        int num = 121;
        int original = num;
        int reverse = 0;

        for (int temp = num; temp > 0; temp /= 10) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
        }

        if (original == reverse)
            System.out.println(original + " is a palindrome number");
        else
            System.out.println(original + " is not a palindrome number");
    }
}