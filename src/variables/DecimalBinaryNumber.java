package variables;


import java.util.Scanner;

public class DecimalBinaryNumber {



        public static void main(String[] args) {
            // Create a scanner object to get user input

            Scanner scanner = new Scanner(System.in);

            // Input the decimal number
            System.out.print("Input a Decimal Number: ");
            int decimalNumber = scanner.nextInt();

            // Convert the decimal number to binary using Integer's method
            String binaryNumber = Integer.toBinaryString(decimalNumber);

            // Output the binary number
            System.out.println("Binary number is: " + binaryNumber);
        }
    }

