package variables;
/**
 * 19. Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner;


public class StringLowercase {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to lowercase
        String lowerCaseString = inputString.toLowerCase();

        // Output the result
        System.out.println("Lowercase string: " + lowerCaseString);
    }
}

