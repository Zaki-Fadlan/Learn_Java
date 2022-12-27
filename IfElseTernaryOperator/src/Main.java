public class Main {
    public static void main(String[] args) {

        System.out.println("Short Hand if else");
        System.out.println("There is also a short hand if else, which knows as the ternaru operator cuz it consist of three operands." + "\nit can be used to replace multiple kines of code with a single line adn is most often used to replace simple if else statement." + "\nSyntax:" + "\nvariable  = (condition) ? expressionTrue :  expressionFalse;");

        System.out.println("Example:\n        " +
                "        int time = 20;\n" +
                "        if (time < 18) {\n" +
                "            System.out.println(\"Good Day.\");\n" +
                "        } else {\n" +
                "            System.out.println(\"Good Evening\");\n" +
                "        }");
        System.out.println("Result : ");
        int time = 20;
        if (time < 18) {
            System.out.println("Good Day.");
        } else {
            System.out.println("Good Evening");
        }
        System.out.println("Now We can simply write with : ");
        System.out.println("int time = 20 ;" +
                "\nString result = (time<18)? \"Good Day\":\"Good Evening\";");
        System.out.println("Result :");
        String result = (time < 18) ? "Good Day" : "Good Evening";
        System.out.println(result);
    }
}