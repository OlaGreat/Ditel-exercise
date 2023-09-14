package chapter2;

public class WhatDoTheyPrint {
    public static void main(String[] args) {
        int x = 5;
        int y = 1;
        System.out.printf("x = %d%n", x+5);
        System.out.printf("Value of %d * %d is %d\n", x, y, (x * y));
        System.out.printf("x is %d and y is %d\n", x, y);
        System.out.printf("%d is not equal to %d\n", (x + y), (x * y) );

        int p = 5;
        System.out.printf("%d%n", p + 2 * 4);
        System.out.printf("%d%n", p * 2 + 4);

    }
}
