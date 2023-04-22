package day04wrappers;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your value: ");
        int value = scanner.nextInt();

        int first = value % 10;
        value = value / 10;

        int second = value % 10;
        value = value / 10;

        int thirth = value % 10;
        value = value / 10;

        int forth = value % 10;
        value = value / 10;

        int fifth = value % 10;
        value = value / 10;

        int sum = fifth + forth + second + first;

        System.out.println("Result of Total: " + sum);
    }
}
