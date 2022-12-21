public class Main {
    public static void main(String[] args) {
        System.out.println("Java Numbers".toUpperCase());
        System.out.println("Primitive numbers types are divide into two groups" +
                "there are Interger type and Floating types interger type store whole numbers, positive or negative such as 123 or -456" +
                "without decimal, valid type are byte , short, int, and long. which type shoud use depend on the numberic value" +
                "and floating point types represent number with fractional part, containing one or more decimal, there are two type, is it float and double");
        System.out.println("Integer Types".toUpperCase());
        System.out.println("Byte, the byte data type can store whole number from -128 to 127 this can be used instead of int or other integer type to savememory when we are certain that the value will be within -128 and 127.");
        byte myNum = 100;
        System.out.println("Example: \nbyte mynum = "+myNum+";");
        System.out.println("Short");
        System.out.println("the short data type can store whole numbers from -32768 to 32767");
        short myNumShort = 5000;
        System.out.println("Example:\nshort myNumShort = "+myNumShort+";");
        System.out.println("Int");
        System.out.println("The int data type can store whole numbers from -2147483648 to 2147483647. the int data type is the preferred data type when we create variables with a numeric value");
        int myIntNum = 100000;
        System.out.println("example : \nint myIntNum = "+myIntNum+";");
        System.out.println("Long");
        System.out.println("The long data type canstore whole number from -9223372036854775808 to 9223372036854775807. this is used when int is not large enough to store the value. usage this we must put L letter at the end value");
        long myLong = 150000000L;
        System.out.println("Example :\nlong myLong = "+myLong+";");

        System.out.println("Floating Point Types");
        System.out.println("We should use a floating point type whenever we need anumber with decimal such 4.5 5.3 etc" +
                "the float and double data types can store fractional numbers. note that you should end the value with an \"f\" for float and \"d\" for doubles");
        float myFloat = 5.23f;
        double myDouble = 19.9999d;

        System.out.println("example :\nfloat myFloat = "+myFloat+"; //float have six or seven decimal digit");
        System.out.println("example :\ndouble myDouble = "+myDouble+";//double about 15 decimal digit");
    }
}