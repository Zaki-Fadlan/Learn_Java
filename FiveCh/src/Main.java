public class Main {
    public static void main(String[] args) {
        
        System.out.println("Data Types Boolean");
        System.out.println("in programming language we will need data type only can have two values, like yes/no , true/false, on/off" +
                "for this java have boolean data type which can only take values true or false\nexample:");
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("boolean isJavaFun = "+isJavaFun+";");
        System.out.println("boolean isFishTasty = "+ isFishTasty+";");

        System.out.println("\nJava Character".toUpperCase());
        System.out.println("the char data type is used to store a single character the character must be surrounded bu single quotes like 'A' or 'c'.\nExample:\n");
        char myGrade = 'B';
        System.out.println("char myGrade = '"+myGrade+"';");
        System.out.println("Alternatively, if you are familiar with ASCII values, you can use those to dispay certain characters:");
        char myVar1 =65,myVar2=66,myVar3=67;
        System.out.println("Example: char myVar1 = 65,myVar2 = 66,myVar3 = 67; ");
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        System.out.println("\nStrings" );
        System.out.println("The String data type is used to store a sequence of characters (text). string values must be surrounded by double quotes: ");
        String greeting = "Hello world!";
        System.out.println("Example: String greeting = \""+greeting+"\";");
    }
}