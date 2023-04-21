package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first number: ");
        int first = scanner.nextInt();

        System.out.print("Please enter your second number: ");
        int second = scanner.nextInt();

        int sumResult = sum(first,second);
        System.out.println("Sum Result: " + sumResult);
    }

    public static int sum(int first, int second){
        return first + second;
    }
}
