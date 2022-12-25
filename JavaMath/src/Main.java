public class Main {
    public static void main(String[] args) {

        System.out.println("Java Math".toUpperCase());
        System.out.println("The java math class has many methods that allows yout to perform mathematical task numbers.");
        System.out.println("Match.max(x,y)");
        System.out.println("this method can be used to find the highest value of x and y");
        System.out.println("Example : Math.max(5,10) = "+Math.max(5,10));
        System.out.println("Math.min(x,y)\nExample : Math.min(5,10) \nResult : "+Math.min(5,10));
        System.out.println("Math.sqrt(x)\nThe Math.sqrt(x) method returns the square root of x:\nExample : Math.sqrt(64)\nResult : "+Math.sqrt(64));
        System.out.println("Matc.abs(x)\nThis method return the absolute (positive) value of x \nExample:\nMath.abs(-4.7)\nResult: "+Math.abs(-4.7));
        System.out.println("Math.random()\n return a random number between 0.0 (inclusive, and 1.0(exclusive))\nExample :\nMath.random()\nResult = "+Math.random());
        System.out.println("To get more control over the random number, for example, if u only want a random number between 0 and 100, you can use the following formula:\nint randomNum = (int)(Math.random()*101\nResult : "+(int)(Math.random() * 101));
    }
}