package variables;

/**Write a Java program to print the sum (addition), multiply, subtract, divide and
 remainder of two numbers.
 Test Data:
 Input first number: 125
 Input second number: 24
 Expected Output :
 125 + 24 = 149
 125 - 24 = 101
 125 x 24 = 3000
 125 / 24 = 5
 125 mod 24 = 5
 *
 */

public class PrintSumMultipySub {
    public static void main(String[] args) {
        int num1 = 125;
        int num2 = 24;
        int sum = num1 + num2;
        int multipy = num1 * num2;
        int subtract = num1 - num2;
        int divided = num1 / num2;
        int remainder = num1 % num2;

        System.out.println(num1 + "+" + num2 +"=" + sum);
        System.out.println(num1  + "-" + num2 + "="+ subtract);
        System.out.println(num1 + "*" + num2 + "="+ multipy);
        System.out.println(num1 + "/" + num2 + "="+ divided);
        System.out.println(num1  + " mod " + num2 + " = " + remainder);

    }
}