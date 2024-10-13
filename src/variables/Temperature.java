package variables;

import java.util.Scanner;

/**Write a program to insert any temperature value in degree Fahrenheit and
 convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 *
 */

public class Temperature {

    public static void main(String[] args) {
        // create a scanner object

        Scanner scanner = new Scanner(System.in);

        // input temperature in fehrenhein
        System.out.println("Enter temperature in Fahrenheit");

        double Fahrenheit = scanner.nextDouble();

        // convert to using formula (F - 32) * 5/9
        double fahrenheit = ( Fahrenheit - 32 * 5/9);
        // disply the result

        System.out.println("Temperature in celsius:");
        // sccaner close
        scanner.close();

    }
}
