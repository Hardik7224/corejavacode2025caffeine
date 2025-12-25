package section6_Iterative_statements;

// Armstrong / Narcissistic Number -> Sum of digits raised to the power of number of digits equals the number.
//                                  Ex: 153 -> 1+125+27 = 153

public class Example12 {
    public static void main(String[] args) {
        // Armstrong Number
        int num = 153;
        int original = num;
        int sum = 0;

        // Count digits
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is not an Armstrong number");
    }
}