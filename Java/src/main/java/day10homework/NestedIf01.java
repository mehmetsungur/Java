package day10homework;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Side: ");
        int a = input.nextInt();

        System.out.print("2. Side: ");
        int b = input.nextInt();

        System.out.print("3. Side: ");
        int c = input.nextInt();

        if (a+b > c && c > Math.abs(a-b))
            System.out.println("TRUE");
            if (a+c > b && b > Math.abs(a-c))
                System.out.println("TRUE");
                if (b+c > a && a >Math.abs(b-c))
                    System.out.println("TRUE");
                    if (a == b && b == c)
                        System.out.println("SAME SIDE");
    }
}
