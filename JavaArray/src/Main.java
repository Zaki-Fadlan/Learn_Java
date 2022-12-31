public class Main {
    public static void main(String[] args) {

        System.out.println("Java Arrays".toUpperCase());
        System.out.println("Java Arrays are used to store multiple vaules in a single variable, instead of deaclaring separate varibales for each value." +
                "to declare an array, define the variable type with square brackets");
        System.out.println("String[] cars;");
        System.out.println("We Have now declared a variable that holds an array of strings. to insert values to it, you can place the values in comma-separated list, inside curly braces:" +
                "\nString[] cas = {\"Volvo\",\"BMW\",\"Vord\",\"Mazfa\"}");
        System.out.println("to create an array of integers, you cold write:");
        System.out.println("int[] myNum = {10,20,30,40};");
        System.out.println("Acces the element of an array");
        System.out.println("You can acces an array element bu referring to the index number. Thi statement accesses the value of the first element in cars:");
        System.out.println("Example:");
        System.out.println("        String[] cars = {\"Volvo\",\"BMW\",\"Ford\",\"Mazda\"};\n" +
                "        System.out.println(cars[0]);");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        System.out.println("Change an array element.");
        System.out.println("To change the value of a specific elent, refet to the index number:" +
                "Example:\n" +
                "cars[0] = \"Opel\"");
        cars[0]="Opel";
        System.out.println(cars[0]);
        System.out.println("Array java length");
        System.out.println("To find out how many element an array has, use the length property:");
        System.out.println("Example");
        System.out.println(cars.length);
    }
}