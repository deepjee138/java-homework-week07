package variables;

import java.util.Scanner;

/**Write a Java program to add two binary numbers.

 Input Data:
 Input first binary number: 10
 Input second binary number: 11
 Expected Output:

 Sum of two binary numbers: 101
 *
 */

public class TwoBinary {

        public static void main(String[] args) {
            // Create a scanner object to get user input
            Scanner scanner = new Scanner(System.in);

            // Input the first binary number
            System.out.print("Input first binary number: ");
            String firstBinary = scanner.nextLine();

            // Input the second binary number
            System.out.print("Input second binary number: ");
            String secondBinary = scanner.nextLine();

            // Convert the binary strings to decimal numbers
            int num1 = Integer.parseInt(firstBinary, 2);
            int num2 = Integer.parseInt(secondBinary, 2);

            // Add the two decimal numbers
            int sum = num1 + num2;

            // Convert the result back to binary
            String binarySum = Integer.toBinaryString(sum);

            // Output the result
            System.out.println("Sum of two binary numbers: " + binarySum);

        }
    }

