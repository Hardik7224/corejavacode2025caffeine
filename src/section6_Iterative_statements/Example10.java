package section6_Iterative_statements;

public class Example10 {
    public static void main(String[] args) {
        // Understanding continue statement
        System.out.println("Using Continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                continue;  // skip 3
            System.out.println(i);
        }

        // Understanding break statement
        System.out.println("\nUsing Break:");
        for (int i = 1; i <= 5; i++) {
            if (i == 4)
                break;  // stop at 4
            System.out.println(i);
        }
    }
}