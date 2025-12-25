package section6_Iterative_statements;

// Strong Number -> Sum of factorial of digits equals the number.
//                    Ex: 145 -> 1!+4!+5! = 145

public class Example13 {
    // Function to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // Strong Number
        int num = 145;
        int original = num;
        int sum = 0;

        for (int temp = num; temp > 0; temp /= 10) {
            int digit = temp % 10;
            sum += factorial(digit);
        }

        if (sum == original)
            System.out.println(original + " is a Strong number");
        else
            System.out.println(original + " is not a Strong number");
    }
}