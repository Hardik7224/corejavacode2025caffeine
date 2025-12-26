package section2_Datatypes_variables_and_literals;

public class Example9
{
    public static void main(String[] args)
    {
        // More Information On Float Data Type
        float f1 = 12.1234567890f;
        System.out.println(f1);

        System.out.println(Float.isFinite(f1));

        float f2 = 0.0f/0.0f;
        System.out.println(f2);  // Gives N.A.N Value
        System.out.println(Float.isFinite(f2));
        System.out.println(Float.isNaN(f2));
        System.out.println(Float.isInfinite(f2));

        float f3 = 3.0f/0.f;
        System.out.println(f3);  // Gives Infinity
        System.out.println(Float.isInfinite(f3));
        System.out.println(Float.isNaN(f3));

        float f4 = -3.0f/0.0f;
        System.out.println(f4);  // Gives -Infinity
    }
}