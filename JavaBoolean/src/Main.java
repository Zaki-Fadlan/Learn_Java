public class Main {
    public static void main(String[] args) {

        System.out.println("java booleans".toUpperCase());
        System.out.println("Java Booleans very often in programming, you will need a data type that can only have onne of two values, like : YES/NO,ON/OFF,TRUE/FALSE:" +
                "\nfor this java has a boolean data type, which can store true or false values.");
        System.out.println("\nBoolean Values");
        boolean isJavaFun = true;
        boolean isFishtasty = false;
        System.out.println("A boolean is declared with the boolean keyword and can only take the values true or false:" +
                "\nExample:" +
                "\nboolean isJavaFun = "+isJavaFun+";" +
                "\nboolean isFishtasty= "+isFishtasty+";");
        System.out.println("However, it is more common to return boolean values from boolean expressions, for conditional testing (see below)");
        System.out.println("\nBoolean Expression");
        System.out.println("A boolean expression returns a boolean value : true or false." +
                "\nThis is useful to build logic and find answer." +
                "\nFor Example you can comparsion operator, such as the greater than (>) operator, to find out if an expression (or a variable) is true or false:");
        int x = 10;
        int y = 9;
        System.out.println("Example:\n" +
                "int x = 10;\n" +
                "int y = 9;\n" +
                "Result = "+(x>y));
        System.out.println("Other Example :\n" +
                "10 == 5, Result = "+(10==5));
        int myAge = 22;
        int votingAge =18;
        System.out.println("Real Life Example :\n" +
                "int myAge = 22;\n" +
                "int votingAge =  18;\n" +
                "Result (myAge >= votingAge) = "+(myAge>=votingAge));
        System.out.println("Another Example  wrap the code above in an if...else statement, so we can perform different actions depending on the result:" +
                "\nExample:\n" +
                "int myAge = 22 ;\n" +
                "int votingAge=18;\n" +
                "\nif (myAge >= votingAge){" +
                "\n\tSystem.out.println(\"Old Enough to vote!\")}" +
                "\nelse{\n" +
                "\tSystem.out.println(\"Not Enough Age to vote!\")\n" +
                "}\n" +
                "The Result is : "+(myAge>=votingAge)+",And Condition Old Enough to Vote!");
    }
}