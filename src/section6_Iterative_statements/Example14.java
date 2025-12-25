package section6_Iterative_statements;

// Perfect Number -> Sum of proper divisors equals the number.
//                   Ex: 6 → 1 + 2 + 3 = 6

public class Example14 {
    public static void main(String[] args) {
        // Perfect Number
        int num = 28;
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num)
            System.out.println(num + " is a Perfect number");
        else
            System.out.println(num + " is not a Perfect number");

    }
}