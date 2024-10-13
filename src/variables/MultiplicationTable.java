package variables;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // create a scnner object to take input from the users
        Scanner scanner = new Scanner(System.in);

        // user enter the number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // print a multiplication table up to 10
        System.out.println("multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + "=" + (number * i));
        }
         scanner.close();
    }  }