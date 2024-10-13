package variables;

import java.util.Scanner;

/**Write a program to enter any radius value of the circle and find out the
 area.(Formula of Area A=PI*r*r).
 *
 */
public class RadiusValue {


    public static void main(String[] args) {
        // Create scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");

        double radius = scanner.nextDouble();
        // define the value PI
        final double PI = 3.14;
        //calculate the area of circle
        double area = PI * radius * radius ;
        // output of the area
        System.out.println("The area of the circle is with radius" +"is:"+ area);
        // close the scanner
        scanner.close();
        }

    }

