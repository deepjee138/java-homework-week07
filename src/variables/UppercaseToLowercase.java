package variables;

import java.util.Scanner;

/**
 * 9. Write a program to convert the upper case to lower case.
 */



public class UppercaseToLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // enter the value
        System.out.print("Enter a string in uppercase: ");
        String upperCaseString = scanner.nextLine();

        String lowerCaseString = upperCaseString.toLowerCase();

        System.out.println("The string in lowercase is: " + lowerCaseString);
        // sccaner close
        scanner.close();
    }
}



