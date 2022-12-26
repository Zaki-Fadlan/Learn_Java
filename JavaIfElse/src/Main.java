public class Main {
    public static void main(String[] args) {

        System.out.println("Java If Else".toUpperCase());
        System.out.println("java Conditions and if statements");
        System.out.println("you already know that java support the usual logical conditions from mathematics:" +
                "\n\tLess Than : a < b " +
                "\n\tLess Than or equal to : a <= b" +
                "\n\tGreater than or equal to : a >=b " +
                "\n\tEtc.");
        System.out.println("Java has the following conditional statement:" +
                "\nUse if to specify a block of code to be executed, if a specified condtion is true" +
                "\nUse else to specify a block of code to be excuted, if the same condtion is false" +
                "\nuse else if to specify a new condition to test, if the first condition is false" +
                "\nuse switch to specify many alternative blocks of code to be executed");
        System.out.println("\nIF STATEMENT");
        System.out.println("Syntax :\nif (condition) {");
        System.out.println("\t//block of code");
        System.out.println("}");
        System.out.println("Example : ");
        int x = 20,y = 18;
        System.out.println("int x = 20,y = 18;");
        System.out.println("if(x>y){");
        System.out.println("\tSystem.out.println(\"x is greater than y\")");
        System.out.println("}");
        System.out.println("Result =");
        if (x > y) {
            System.out.println("x is greater than y ");
        }
        System.out.println("The else Statement");
        System.out.println("Use the else statement to specify a block code to be executed if the condition is false.");
        System.out.println("Syntax : ");
        System.out.println("if (condition) {\n" +
                "  // block of code to be executed if the condition is true\n" +
                "} else {\n" +
                "  // block of code to be executed if the condition is false\n" +
                "}");
        System.out.println("Example:");
        System.out.println("int time = 20;\n" +
                "if (time < 18) {\n" +
                "    System.out.println(\"Good Day\");\n" +
                "} else {\n" +
                "    System.out.println(\"Good Evening\");\n" +
                "}");
        System.out.println("Result");
        int time = 20;
        if (time < 18) {
            System.out.println("Good Day");
        } else {
            System.out.println("Good Evening");
        }
        System.out.println("The else if Statement");
        System.out.println("Use this statement to specify a new condition if the first condition is false.");
        System.out.println("Syntax :");
        System.out.println("if (condition1) {\n" +
                "  // block of code to be executed if condition1 is true\n" +
                "} else if (condition2) {\n" +
                "  // block of code to be executed if the condition1 is false and condition2 is true\n" +
                "} else {\n" +
                "  // block of code to be executed if the condition1 is false and condition2 is false\n" +
                "}");
        System.out.println("Example :");
        System.out.println("int time2 = 22;\n" +
                "if (time2 < 10) {\n" +
                "    System.out.println(\"Good morning.\");\n" +
                "} else if (time2 < 18) {\n" +
                "    System.out.println(\"Good day.\");\n" +
                "} else {\n" +
                "    System.out.println(\"Good evening.\");\n" +
                "}");
        System.out.println("Result:");
        int time2 = 22;
        if (time2 < 10) {
            System.out.println("Good morning.");
        } else if (time2 < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}