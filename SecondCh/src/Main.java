public class Main {
    public static void main(String[] args) {

        System.out.println("Java Variables".toUpperCase());
        String name = "John";
        System.out.println("Ex: String name = \"John\";");
        System.out.println("Hello " + name);
        System.out.println("Add + : Example:" +
                "        \n\tString firstName = \"Zaki \";" +
                "        \n\tString lastName = \"Fadlan\";" +
                "        \n\tString fullName = firstName + lastName;");
        String firstName = "Zaki ";
        String lastName = "Fadlan";
        String fullName = firstName + lastName;
        System.out.println("Result :  "+fullName);

        System.out.println("Numeric Value".toUpperCase());
        System.out.println("Example :" +
                "         \n\tint x = 5;" +
                "         \n\tint y = 7;" +
                "         \n\tint z = x+y;");
        int x = 5;
        int y = 7;
        int z = x+y;
        System.out.println("Result = "+z+"\n");

        System.out.println("Declare Multiple variable".toUpperCase());
        System.out.println("Example:        " +
                "\n\tint x_ = 5;" +
                "\n\tint y_ = 7;" +
                "\n\tint z_ = 50;" +
                "System.out.println(x_+y_+z_);");
        int x_ = 5;
        int y_ = 7;
        int z_ = 50;
        System.out.println(x_+y_+z_);
        System.out.println("It can be change to: int x=5,y=6,z=50;");
        System.out.println("If all variable have same value it can change to :\n int x,y,z;\nx = y = z = 50");
        int xx,yx,zx;
        xx = yx = zx = 50;
        System.out.println(xx+yx+zx);

        System.out.println("java identifier".toUpperCase());
        System.out.println("Variable must unique and indentified, variables can be shor names like x or y but better it is descriptive like age,sum totalValue etc");
        System.out.println("for Example : " +
                "int minutesPerHour = 60; is it better than, int m = 60;");
        System.out.println("Rule naming variable" +
                "\n1.Can containt letter, digits, underscores and dollar signs" +
                "\n2.Must begin with a letter" +
                "\n3.Should start with a lowercase letter and it cannot contain whitespace" +
                "\n4.Can also begin with $ and _" +
                "\n5.Name is case sensitive" +
                "\n6.Reserved words can't be used as names like int boolean float etc.");
    }
}