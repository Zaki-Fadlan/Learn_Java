public class Main {
    public static void main(String[] args) {

        System.out.println("Java Break".toUpperCase());
        System.out.println("you have already seen the break statement used in an earlier chapter of this tutorial." +
                "\nit was used to jump out of a switch statement." +
                "\nthe break statemen can also be used to jump out of a loop.\n" +
                "this is example stops the loop when i is equal to 4:");
        System.out.println("for (int i= 0; i < 10;i++){\n" +
                "\tif(i==4){\n" +
                "\t\tbreak;\n" +
                "}\n" +
                "System.out.println(i);\n}");
        System.out.println("Result:");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Java Continue".toUpperCase());
        System.out.println("The continue statement break one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.");
        System.out.println("Example(Skip the value of 4:)");
        System.out.println("for (int j = 0;j<10;j++){\n\t" +
                "if(j==4){\n\t\t" +
                "continue;\n}" +
                "\nSystem.out.println(j);\n}");
        System.out.println("result");
        for (int j = 0; j < 10; j++) {
            if (j == 4) {
                continue;
            }
            System.out.println(j);
        }
        System.out.println("Break and Continue in While Loop");
        System.out.println("You can also use break and continue in while loops:");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
        System.out.println("continue Example:");
        while (i<10){
            if (i==4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}