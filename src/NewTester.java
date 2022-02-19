import java.util.Scanner;

public class NewTester {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        System.out.println("Hi, " + keyboard.nextLine() + "!");
    }

}
