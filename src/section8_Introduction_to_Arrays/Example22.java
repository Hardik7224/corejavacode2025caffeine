package section8_Introduction_to_Arrays;

public class Example22 {
    public static void main(String[] args) {
        // Count of vowels and consonants in array
        char[] arr = {'H', 'e', 'l', 'l', 'o', '1', '!'};

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            // check if alphabet
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