public class Main {
    public static void main(String[] args) {
        // Print Text
        System.out.println("Print Text");
        System.out.println("Hello world!");
        System.out.println("I am learning Java.");
        System.out.println("It is awsesome !");

        // Print Number
        System.out.println("\n");
        System.out.println("Print Number");
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);

        //Print with Mathematical Calculations
        System.out.println("\n");
        System.out.println("Mathematical Calculations");
        System.out.println(3+5);
        System.out.println(2*5);

        // Multiline comments
        System.out.println("\n");
        System.out.println("Multiline Comment");
        System.out.println("Its using /* and */");
        /*
        This is example multiline comments
         */

        // Java Variables
        System.out.println("\n");
        System.out.println("Java Variables");
        System.out.println("Java Have types of Variable String, int, float, char, boolean");
        System.out.println("Syntax declaring variables : type variablename = value;");
        System.out.println("Example : String name = \"John\"");
        String name = "John";
        System.out.println("Result printing variable : "+name);
        System.out.println("other example : int myNumber = 2");
        int myNumber = 2;
        System.out.println("Result = "+myNumber);
        System.out.println("varibale can declare without value, and assign it later, for example = int mynum;mynum = 20;");
        int mynum;
        mynum = 20;
        System.out.println("Result : "+mynum);
        System.out.println("Final Variables");
        System.out.println("For example if variable declared with final it can't written or update the value. EX: final int myNum=12;myNum=20; it will be get error");
        final int myNumbers =15;
//        myNumbers= 20;
        System.out.println("result "+myNumbers);

        //Other types
        float myFloatnum = 20.1F;
        char myChar = 'F';
        boolean myBool = true;
        String myText = "MyText";
        System.out.println("Other Types variable");
        System.out.println("int myNumbers = "+myNumbers+";");
        System.out.println("float myFloatnum = "+myFloatnum+";");
        System.out.println("char myChar = "+myChar+";");
        System.out.println("boolean myBool = "+myBool+";");
        System.out.println("String myText = "+myText+";");

        System.out.println("Source Learning From w3school : https://www.w3schools.com/java/java_variables_print.asp");

    }
}