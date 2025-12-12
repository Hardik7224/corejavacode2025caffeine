package section7_Printing_and_String_class;

public class Example10 {
    public static void main(String[] args)
    {
        // Literal String
        String sData1 = "Spark";

        // Heap String
        String sData2 = new String("Spark");

        String sData3 = "Spark";

        // Difference between == operator and equals() method
        boolean isSame;

        isSame = sData1 == sData2;
        System.out.println(isSame);

        isSame = sData1 == sData3;
        System.out.println(isSame);

        isSame = sData1.equals(sData2);
        System.out.println(isSame);

    }
}