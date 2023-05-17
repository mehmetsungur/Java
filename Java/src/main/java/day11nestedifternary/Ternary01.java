package day11nestedifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is Number: ");
        int num = input.nextInt();

        if (num % 2 == 0)
            System.out.println("Number is double");
        else
            System.out.println("Number is single");

        String result = (num % 2 == 0) ? "Number is double" : "Number is single";
        System.out.println(result);

        int i = 15;
        int k = i++;
        int a = 9;
        int m = ++a;

        System.out.println(i);
        System.out.println(k);
        System.out.println(a);
        System.out.println(m);
    }
}
