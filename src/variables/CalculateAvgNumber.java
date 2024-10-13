package variables;

import java.util.Scanner;

/**Write a Java program that takes three numbers as input to calculate and
 print the average of the numbers.
 *
 */

public class CalculateAvgNumber {


    public static void main(String[] args) {

        // enter a value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number;");
        double num1 = scanner.nextDouble();
        System.out.println( "Enter a second number;");
        double num2 = scanner.nextDouble();
        System.out.println( " enter a third number;");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3)/3;
        System.out.println( "The avg of the three number is:"+ average);


        // scanner close
        scanner.close();


    }
}
