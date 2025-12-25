package section6_Iterative_statements;

// Perfect Square -> A number is a perfect square if it is the square of an integer.
//                   Ex: 16 => 4² -> perfect square

public class Example16 {
    public static void main(String[] args) {
        // Perfect Square Number
        int num = 25;
        boolean isPerfect = false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfect = true;
                break;
            }
        }

        if (isPerfect)
            System.out.println(num + " is a Perfect Square");
        else
            System.out.println(num + " is not a Perfect Square");

    }
}