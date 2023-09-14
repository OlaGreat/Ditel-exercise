package chapter2;

import java.util.Scanner;

public class ApplicationThatSumSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter number2: ");
        int number2 = input.nextInt();

        int squareOfNumber1 = number1*number1;
        int squareOfNumber2 = number2*number2;


        System.out.printf("The square of number 1 is %d%n ", squareOfNumber1);
        System.out.printf("The square of number 2 is %d%n ", squareOfNumber2);
        System.out.printf("The sum of square of both numbers is %d%n ", squareOfNumber2 + squareOfNumber1);
        System.out.printf("The difference of square of both numbers is %d%n ", squareOfNumber1 - squareOfNumber2);
    }
}
