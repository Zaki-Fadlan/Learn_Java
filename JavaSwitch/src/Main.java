public class Main {
    public static void main(String[] args) {
        System.out.println("Java Switch");
        System.out.println("Java Switch Statement\nInstead of writing many if .. else statement, you can use the switch statement. the switch statement select one of many code block to be excuted:");
        System.out.println("Syntax:\n" +
                "switch(xpression){\n" +
                "   case value1:\n" +
                "       //code block\n" +
                "   case value2 :\n" +
                "       //code block\n" +
                "   default:\n" +
                "       //code block\n}");
        System.out.println("This is how it works:" +
                "\n- The switch expression is evaluated once." +
                "\n- The value of the expression is compared with the values of each case." +
                "\n- If there is a match associated block of code is executed." +
                "\n- The break and default keyword are optional. and will be described later in this chapter.");
        System.out.println("The Example below uses the weekday number to calculate the weekday name:" +
                "\nExample:");
        System.out.println("int day = 4;\n" +
                "switch (day) {\n" +
                "  case 1:\n" +
                "    System.out.println(\"Monday\");\n" +
                "    break;\n" +
                "  case 2:\n" +
                "    System.out.println(\"Tuesday\");\n" +
                "    break;\n" +
                "  case 3:\n" +
                "    System.out.println(\"Wednesday\");\n" +
                "    break;\n" +
                "  case 4:\n" +
                "    System.out.println(\"Thursday\");\n" +
                "    break;\n" +
                "  case 5:\n" +
                "    System.out.println(\"Friday\");\n" +
                "    break;\n" +
                "  case 6:\n" +
                "    System.out.println(\"Saturday\");\n" +
                "    break;\n" +
                "  case 7:\n" +
                "    System.out.println(\"Sunday\");\n" +
                "    break;\n" +
                "}");
        System.out.println("Result : ");
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        System.out.println("The Break Keyword");
        System.out.println("When Java reaches a break keyword, it breaks out of the switch block. This will stop the execution of more code and case testing inside the block." +
                "\nwhen a match is found, and the job is done. it's time for a break. There is no need for more testing");
        System.out.println("a break can save a lot of execution time cause it \"ignores\" the execution of all the rest of the code in the switch block.");
        System.out.println("The Default Keyword");
        System.out.println("The deafult keyword specifies some code to run if there is co case match :");
        System.out.println("Example:");
        System.out.println("int day = 4;\n" +
                "switch (day) {\n" +
                "  case 6:\n" +
                "    System.out.println(\"Today is Saturday\");\n" +
                "    break;\n" +
                "  case 7:\n" +
                "    System.out.println(\"Today is Sunday\");\n" +
                "    break;\n" +
                "  default:\n" +
                "    System.out.println(\"Looking forward to the Weekend\");\n" +
                "}");
        System.out.println("Result :");
        int day2 = 4;
        switch (day2) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }
}