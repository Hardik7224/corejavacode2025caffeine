package section7_Printing_and_String_class;

public class Example19 {
    public static void main(String[] args) {
        // Count words in a string
        String s = "Java is fun";
        s = s.trim(); // Remove leading/trailing spaces

        if (s.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = s.split("\\s+"); // split by one or more whitespaces
            System.out.println("Word count: " + words.length);
        }

    }
}