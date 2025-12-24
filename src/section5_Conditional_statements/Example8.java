package section5_Conditional_statements;

// Pythagorean Triplet -> A Pythagorean Triplet consists of three positive integers a,b,c such that:
//                          a² + b² = c²
//                        Ex : (3,4,5) -> 3² + 4² = 5² => 9 + 16 = 25

public class Example8 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;

        // Find the largest number to assume as hypotenuse
        int max = Math.max(a, Math.max(b, c));
        int sumSquares = 0;

        if (max == a)
            sumSquares = b * b + c * c;
        else if (max == b)
            sumSquares = a * a + c * c;
        else
            sumSquares = a * a + b * b;

        if (max * max == sumSquares)
            System.out.println(a + ", " + b + ", " + c + " form a Pythagorean Triplet");
        else
            System.out.println(a + ", " + b + ", " + c + " do NOT form a Pythagorean Triplet");

    }
}