package section7_Printing_and_String_class;
import java.util.Arrays;

public class Example12 {
    public static void main(String[] args) {
        // Understanding split and join method

        // split using space
        String skillSet = "Java C++ Python Js";
        String[] skills = skillSet.split(" ");
        System.out.println(Arrays.toString(skills));
        System.out.println(skills[0]);
        System.out.println(skills[1]);
        System.out.println(skills[2]);
        System.out.println(skills[3]);

        // join array elements into a single string
        String joinedSkills = String.join(", ", skills);
        System.out.println("Joined Skills: " + joinedSkills);

        // split using #
        String sData = "Red#Blue#Green";
        String[] data = sData.split("#");
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);

        // join again
        String joinedColors = String.join(" | ", data);
        System.out.println("Joined Colors: " + joinedColors);

        // split email using @
        String email = "thisisxyz@gmail.com";
        data = email.split("@");
        System.out.println(data[0]);
        System.out.println(data[1]);

        // join email back
        String joinedEmail = String.join("@", data);
        System.out.println("Joined Email: " + joinedEmail);
    }
}