// ============================================================
// HelloUser.java - A beginner Java program
// ============================================================
// This program asks for your name and favorite number,
// then prints your number doubled.
// ============================================================

// 'import' brings in code from Java's standard library.
// Scanner is a class that lets us read input from the keyboard.
import java.util.Scanner;

// Every Java program needs at least one class.
// The class name MUST match the file name (HelloUser.java -> class HelloUser).
public class HelloUser {

    // This is the "entry point" — where the program starts running.
    //
    //   public  -> accessible from anywhere (required for main)
    //   static  -> belongs to the class itself, not an instance of it
    //   void    -> this method doesn't return a value
    //   main    -> special name Java looks for to start the program
    //   String[] args -> command-line arguments (we won't use them here)
    //
    public static void main(String[] args) {

        // --- Create a Scanner to read keyboard input ---
        // 'System.in' represents the keyboard (standard input).
        Scanner scanner = new Scanner(System.in);

        // --- Ask for the user's name ---
        // 'System.out.println' prints text followed by a new line.
        System.out.println("Welcome to your first Java program!");
        System.out.print("What is your name? "); // 'print' stays on the same line

        // 'nextLine()' reads everything the user types until they press Enter.
        // We store it in a variable of type 'String' (text).
        String name = scanner.nextLine();

        // --- Ask for their favorite number ---
        System.out.print("What is your favorite number? ");

        // 'nextInt()' reads an integer (whole number) from input.
        // We store it in a variable of type 'int' (integer).
        int favoriteNumber = scanner.nextInt();

        // --- Calculate the doubled value ---
        int doubled = favoriteNumber * 2;

        // --- Print the results ---
        // We can join strings and variables together with '+'
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("Your favorite number is " + favoriteNumber + ".");
        System.out.println("That number doubled is " + doubled + "!");

        // --- Clean up ---
        // Always close the Scanner when you're done with it.
        scanner.close();
    }
}
