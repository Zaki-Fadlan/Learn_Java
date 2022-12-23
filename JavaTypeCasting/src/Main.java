public class Main {
    public static void main(String[] args) {

        System.out.println("java type casting".toUpperCase());
        System.out.println("Type Casting is when you assign a value of one primitive data type to another type.");
        System.out.println("in Java, the are two type casting:");
        System.out.println("Widening Casting (Automatically) - Converting a smaller type to a larger type \n" +
                "byte -> short -> char -> int -> long -> float -> double");
        System.out.println("Narrowing Casting (Manually) -converting a larger type to a smaller size type \n" +
                "double -> float -> long -> int -> char -> short -> byte");

        System.out.println("\nWidening Casting".toUpperCase());
        System.out.println("Widening Casting is done automaticall when passing a smaer size type to a larger size. Example:");
        int myInt = 9;
        double myDouble = myInt;
        System.out.println("int myInt = " +myInt+";"+
                "\ndouble myDouble = myInt;\n" +
                "the output myDouble will be = "+myDouble);
        System.out.println("\nNarrowing Casting".toUpperCase());
        System.out.println("Narrowing Casting must be done manually by placbg the type in parantheses in front of the value : ");
        double myDoublee = 9.78d;
        int myIntt = (int) myDoublee;
        System.out.println("Example:\n" +
                "        double myDoublee = "+myDoublee+";\n" +
                "        int myIntt = (int) myDoublee;" +
                "\n myIntt will be = "+myIntt);
    }
}