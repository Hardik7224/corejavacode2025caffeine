package section7_Printing_and_String_class;

public class Example13 {
    public static void main(String[] args) {
        // Count of vowels and consonants in string
        String s = "Hello";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // check alphabet
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                // convert uppercase to lowercase
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char)(ch + 32);
                }
                // vowel check
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

    }
}