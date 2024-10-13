package variables;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 *
 * Test Data:
 * Width = 5.5 Height = 8.5
 *
 * Expected Output:
 *
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        double width = 5.5;
        double heigh = 8.5;

        double area = width * heigh;
        double perimeter = 2*(width + heigh);


    }

}
