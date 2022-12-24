public class Main {
    public static void main(String[] args) {

        System.out.println("Java String".toUpperCase());
        System.out.println("Java String are used for storing text. A string varibale contains a collection of charachters surrounded by double quotes:" +
                "\nExample:");
        String greeting = "Hello World!";
        System.out.println("String greeting = \""+greeting+"\";");
        System.out.println("String Length".toUpperCase());
        System.out.println("A String in Java is Actually an Object, Which Contain method that can perform certain operation on string. For Example, the length of a string can be found with the length() method:");
        String txt ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("String txt = \"ABCDEFGHIJKLMNOPQRSTUVWXYZ\";");
        System.out.println("Result = "+txt.length());
        System.out.println("More String Methoods");
        System.out.println("There are many string methods available, for example toUpperCase() and toLoweCase()");
        String txtt = "Hello World!";
        System.out.println("Example : String txtt = \"Hello World!\";");
        System.out.println("Result Uppercase = "+txtt.toUpperCase());
        System.out.println("Result Lowercase = "+txtt.toLowerCase());
        System.out.println("\nFinding a Character in a String".toUpperCase());
        System.out.println("The indexOf() method return the index(the position) of the first occurence of a specified text in a string (incluiding whitespace):\nExample:");
        String txttt = "please locate where 'locate' occurs!";
        System.out.println("String txttt = \"please locate where 'locate' occurs!\";");
        System.out.println("results : "+txttt.indexOf("locate"));
        System.out.println("\nJava String Concatenation");
        System.out.println("String concatenation\n the + operator can be used between strings to combine them. this is called concatenation:\nExample:\n");
        String firstName = "Zaki";
        String lastName = "Fadlan";
        System.out.println("" +
                "        String firstName = \"Zaki\";\n" +
                "        String lastName = \"Fadlan\";");
        System.out.println("Result concatenation : "+firstName+" "+lastName);
        System.out.println("We can also using concat() : firstname.concat(lastname)\nResult: "+firstName.concat(lastName));
        System.out.println("Java numbers and string".toUpperCase());
        System.out.println("Adding numbers and string\nJava uses the + operator for both addition and concatenation. numbers are added. String are concatenated.");
        System.out.println("if we add two numbers, the result will be a number :\nExample");
        System.out.println("int x = 10;\nint y = 20; int z=x+y;");
        int x=10,y=20,z=x+y;
        System.out.println("Result : "+z);
        String xx = "10",yy = "20",zz = xx+yy;
        System.out.println("If add two string the resul will be a string concatenation:\nExample: String xx = \"10\",yy = \"20\",zz = xx+yy;");
        System.out.println("result = "+zz);
        int myInt = 20;
        String myString = "My Age is "+myInt+" Years Old";
        System.out.println("If u add a number and a string. the result will be a string concatenation: \nExample: ");
        System.out.println("int myInt = 20;\n" +
                "String myString = \"My Age is \"+myInt+\" Years Old\";");
        System.out.println("The Result will be : "+ myString);
        System.out.println("Java Special Character".toUpperCase());
        System.out.println("String - Special Characters Cause must be wrintten within quotes, java will misunderstand this string, and generate error " +
                "\nFor Example when we declare : String txt = \"We are the so-called \"Vikings\" from the north.\"");

    }
}