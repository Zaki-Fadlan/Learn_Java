public class Main {
    public static void main(String[] args) {

        System.out.println("java operators".toUpperCase());
        int x = 100 + 50;
        System.out.println("Java Operators ar used to perform on variables and values/" +
                "\nin the examke below, we use the + operator to add together two values" +
                "\nExample:" +
                "\n int x = 100 + 50;" +
                "\n x = "+x);
        System.out.println("althought the + operator is often used to add together two values,like in the example above," +
                "\n, it can also be used to add together a variable and a value, or a variable nad another variable:\n" +
                "Example:");
        int sum1 = 100 +50;
        int sum2 = sum1 + 250;
        int sum3 = sum1 +sum2;
        System.out.println("" +
                "        int sum1 = 100 +50;\n" +
                "        int sum2 = sum1 + 250;\n" +
                "        int sum3 = sum1 +sum2;");
        System.out.println("result : " +
                "\nsum1 = "+ sum1 +
                "\nsum2 = "+ sum2 +
                "\nsum3 = "+ sum3);
        System.out.println("\nJava Divides the opertors into following groups:" +
                "\nAritchmetic Operators" +
                "\nAssignment Operators" +
                "\nComparasion Operators" +
                "\nLogical Operators" +
                "\nBitwise Operators");
        System.out.println("Arithmetic Operators".toUpperCase());
        System.out.println("Arithmetic operators are used to perform common mathematical operations" +
                "Operator (+)Addition, (-)Substraction, (*)Multipication, (/)Division, (%)Modulus, (++)Increment, (--)Decrement.");
        System.out.println("java assigntment operators".toUpperCase());
        System.out.println("Assignment operators are used to assign to varibales." +
                "in he example below, we use the assignment operator (=) to assign the value 10 to a variable called z ");
        int z = 10;
        System.out.println("int z = "+z+";");
        System.out.println("The addition assignmen operator += add a value to a variable:" +
                "\nExample:");
        int xx =10;
        xx +=5;
        System.out.println("int xx = 10;" +
                "\nxx+=5;");
        System.out.println("Result xx = "+xx);
        System.out.println("list of all assignment operators : " +
                "\n(=), (+=), (-=), (*=), (/=), (%=), (&=), (|=), (^=), (>>=), (<<=)");
        System.out.println("Java Comparasion Operators".toUpperCase());
        System.out.println("Comparasion Are used to comare two values(or variables). this is important in programming, cuz it help us to find answers and ake decisions." +
                "\nthe return value of a comparison is either true or false. these are knows as boolean values, and u will learn more about them in the Booleans and if .. Else Chapter." +
                "in the following exmample, we use the greater than operator (>) to find out if 5 is greater than 3:");
        int xxx = 5;
        int yyy = 3;
        System.out.println("" +
                "        int xxx = 5;\n" +
                "        int yyy = 3;\n" +
                "result : "+(xxx>yyy));
        System.out.println("Operator (==), (!=), (>), (<), (>=), (<=)");

        System.out.println("Java Logical Operators".toUpperCase());
        System.out.println("You can also test true or false values with logical operators." +
                "Logical operators are used to determine the logic between variable or values");
        System.out.println("Operator :" +
                "\n(&&) AND logical, (||) OR Logical, (!) NOT Logical");

    }
}