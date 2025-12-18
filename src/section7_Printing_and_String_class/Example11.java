package section7_Printing_and_String_class;

public class Example11 {
    public static void main(String[] args) {
        // Understanding String Methods

        String sData1 = "Technology";
        /*
            length() returns the length of the string i.e. number of characters in a string
         */
        int length    = sData1.length();
        System.out.println("Length Of String : " + length);

        /*
            charAt() method takes integer argument and returns the character present at given
            index in string
         */
        int first = 0;
        System.out.println(sData1.charAt(first));

        int mid = (sData1.length()-1)/2;
        System.out.println(sData1.charAt(mid));

        int last = sData1.length()-1;
        System.out.println(sData1.charAt(last));

        /*
            toLowerCase() will change the string to lower case and returns the lower
            case string.
         */
        String sData2 = "CORE JAVA MASTERY";
        String lowerCaseSData2 = sData2.toLowerCase();

        System.out.println("Original String : " + sData2);
        System.out.println("LowerCase : " + lowerCaseSData2);

        /*
            toUpperCase() will change the string to upper case and return the new string
         */
        String sData3 = "minecraft is based on java";
        String upperCaseSData3 = sData3.toUpperCase();

        System.out.println("Original String : " + sData3);
        System.out.println("LowerCase : " + upperCaseSData3);

         /*
            trim() will remove the leading and trailing blank spaces.It is useful when you are
            taking string as an input from user
         */
        String sData4 = "    red  ";
        String trimmedSData4 = sData4.trim();

        System.out.println("Original String : " + sData4);
        System.out.println("Trimmed String  : " + trimmedSData4);

        /*
            replace() method takes two arguments: old character and new character.It will replace
            every old character in string with new character and a new string is returned
         */
        String sData5 = "Java means Programming";
        String replacedSData5 = sData5.replace('a','A');

        System.out.println("Original String : " + sData5);
        System.out.println("Replaced String : " + replacedSData5);

        /*
           startsWith() returns the boolean value based on the argument passed to it.
           It checks if the string is beginning with passed string then returns true
           otherwise false.
         */
        String sData6 = "www.youtube.com";
        boolean isWebsite = sData6.startsWith("www.");

        System.out.println("Original String : " + sData6);
        System.out.println("Is a website : " + isWebsite);

        /*
           endsWith() method is used to check whether string is ending with particular word
           or not.This method returns boolean value.
         */
        String sData7 = "www.wikipedia.org";
        boolean isOrganizationWebsite = sData7.endsWith(".org");

        System.out.println("Original String : " + sData7);
        System.out.println("Is a organization website : " + isOrganizationWebsite);

        /*
          compareTo() compares two strings lexicographically.
          It returns 0, positive or negative value based on comparison.
        */
        String c1 = "Apple";
        String c2 = "Banana";

        System.out.println("compareTo result : " + c1.compareTo(c2));

        /*
          equals() compares the content of two strings.
          It returns true if both strings are equal.
          equalsIgnoreCase() compares two strings ignoring case.
          It returns true if contents are same.
        */
        String e1 = "Java";
        String e2 = "Java";
        String e3 = "java";

        System.out.println("Strings are equal : " + e1.equals(e2));
        System.out.println("Strings are equal : " + e1.equalsIgnoreCase(e3));

        /*
          isEmpty() checks whether the string length is zero.
          It returns true if the string is empty.
        */
        String emptyStr = "";
        System.out.println("Is Empty : " + emptyStr.isEmpty());

        /*
          isBlank() checks whether the string is empty or has only spaces.
          It returns true if no visible characters are present.
        */
        String blankStr = "   ";
        System.out.println("Is Blank : " + blankStr.isBlank());

        /*
          concat() is used to join two strings together.
          It returns a new combined string.
        */
        String firstName = "Bill";
        String lastName = "Gates";

        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name : " + fullName);

        /*
          indexOf() finds the first occurrence of a character or string.
          It returns index value or -1 if not found.
        */
        String word = "Programming";
        System.out.println("Index of 'g' : " + word.indexOf('g'));

        /*
          lastIndexOf() finds the last occurrence of a character or string.
          It returns index value or -1 if not found.
        */
        System.out.println("Last index of 'g' : " + word.lastIndexOf('g'));

        /*
          valueOf() method is used to convert different data types into String.
          It returns the string representation of the given value.
        */
        int x = 10;
        String s = String.valueOf(x);
        System.out.println("Value of x is: " + s);

        /*
          substring() extracts a part of the string.
          It returns a new string excluding the end index.
        */
        String course = "Core Java Mastery";

        String sub = course.substring(5, 9);
        System.out.println("Substring : " + sub);

       /*
         contains() checks if a string contains given characters.
         It returns true if present.
       */
        boolean hasJava = course.contains("Java");
        System.out.println("Contains Java : " + hasJava);

    }
}