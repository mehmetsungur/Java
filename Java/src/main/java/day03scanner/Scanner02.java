package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.next();

        System.out.println("User's Name: " + name);
    }
}
