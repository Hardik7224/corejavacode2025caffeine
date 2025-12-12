package section7_Printing_and_String_class;

public class Example9 {
    // Understanding String Constructors
    public static void main(String[] args)
    {
        // 1. Literal String
        String sData1 = "superstar";
        System.out.println(sData1);

        // 2. Creating String Object From Literal String
        String sData2 = new String("superstar");
        String sData3 = new String(sData1);
        System.out.println(sData2);
        System.out.println(sData3);

        // 3. Empty String
        String sData4 = new String();
        System.out.println(sData4);

        // 4. String From Character Array
        char[] chars = {'A','B','C','D'};
        String sData5 = new String(chars);
        System.out.println(sData5);

        // 5. String From Byte Array
        byte[] nums = {97,98,99,100};
        String sData6 = new String(nums);
        System.out.println(sData6);

    }
}