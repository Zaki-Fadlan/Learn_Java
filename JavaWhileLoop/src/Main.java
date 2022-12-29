public class Main {
    public static void main(String[] args) {

        System.out.println("Java While Loop".toUpperCase());
        System.out.println("Loops");
        System.out.println("loops can execute a block of code as long a specified condition is reached." + "\nLoops are handy because they save time, reduce errors, and they make code more readable.");
        System.out.println("Java While Loop");
        System.out.println("The while loop loops through a block of code as long as a specified condition is true:");
        System.out.println("Syntax:\n" + "while (condition){\n\t//Code block to be executed\n}");
        System.out.println("In the example below, the code in the loop will run, over and over again, as long as a variable (i) is less than 5:");
        System.out.println("Example: \n" + "int i = 5;\n" + "while (i<5){" + "\n\tSystem.out.println(i);" + "\n\ti++;" + "\n}");
        System.out.println("Result:");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("The Do/While Loop");
        System.out.println("The do/while loop is a variant while loop. this loop will execute the code block once, before checking if the condition is true," + "\nthen it will repeat the loop as long as the condition is true.");
        System.out.println("Syntax :");
        System.out.println("do{\n\t" + "//code block to be executed\n}" + "\nwhile (condition);");
        System.out.println("Example :");
        System.out.println("int i = 0;" + "\ndo {\n\t" + "System.out.println(i);" + "\n\ti++;\n}" + "\nwhile(i<5);");
        System.out.println("Result:");
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
        System.out.println("Java For Loop");
        System.out.println("when you know exactly how many times you want to loop through a block of code , use the for loop instead of a while loop:");
        System.out.println("Syntax:\n" + "for (statement 1; statement 2; statement 3){\n\t" + "//code of block code to be executed\n}");
        System.out.println("- Statement 1 is executed one time before the execution of the code block." + "\n- Statement 2 defines the condition for executing the code block." + "\n- Statement 3 is executed every time after the code block has been executed.");
        System.out.println("Example;\n" + "for(int j = 0; j <5 ; j++){" + "\n\tSystem.out.println(j);\n}");
        System.out.println("result :");
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
        System.out.println("Nested Loops");
        System.out.println("It is also possible to place a loop inside another loop. this is calleda nested loop." + "\nThe inner loop will be executed one time for each iteration of the outer loop:");
        System.out.println("Example:\n");
        System.out.println("// Outer loop\n" + "for (int i = 1; i <= 2; i++) {\n" + "  System.out.println(\"Outer: \" + i); // Executes 2 times\n" + "  \n" + "  // Inner loop\n" + "  for (int j = 1; j <= 3; j++) {\n" + "    System.out.println(\" Inner: \" + j); // Executes 6 times (2 * 3)\n" + "  }\n" + "} ");
        System.out.println("Example:\n");
        // Outer loop
        for (int k = 1; k <= 2; k++) {
            System.out.println("Outer: " + k); // Executes 2 times
            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
        System.out.println("Java For Each Loop");
        System.out.println("For-Each Loop");
        System.out.println("there is also a \"For-each\" loop, which is used exclusively to loop through elements in an array:");
        System.out.println("Syntax");
        System.out.println("for (type variablename : arrayname){\n\t//code block to be executed\n}");
        System.out.println("The following example outputs all element in the array, using a \"for-each\" loop:");
        System.out.println("Example :");
        System.out.println("String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n" + "for (String i : cars) {\n" + "  System.out.println(i);\n" + "}");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String m : cars) {
            System.out.println(m);
        }

    }
}