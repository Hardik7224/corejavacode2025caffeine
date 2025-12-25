package section7_Printing_and_String_class;

public class Example16 {
    public static void main(String[] args) {
        // Maximum frequency character
        String s = "Programming";
        s = s.toLowerCase();

        int maxFreq = 0;
        char maxChar = ' ';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                maxChar = ch;
            }
        }

        System.out.println("Maximum frequency character: " + maxChar);
        System.out.println("Frequency: " + maxFreq);
    }
}