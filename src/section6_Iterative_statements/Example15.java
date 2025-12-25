package section6_Iterative_statements;

// Neon Number -> Square the number, sum its digits it will be equals the original number.
//                Ex: 9 → 9²=81 → 8+1=9

public class Example15 {
    public static void main(String[] args) {
        // Neon Number
        int num = 9;
        int square = num * num;
        int sum = 0;

        // Sum digits of the square
        for (int temp = square; temp > 0; temp /= 10) {
            sum += temp % 10;
        }

        if (sum == num)
            System.out.println(num + " is a Neon number");
        else
            System.out.println(num + " is not a Neon number");

    }
}