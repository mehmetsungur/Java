package day10homework;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Password: ");
        String pass = input.nextLine();
        char first = pass.charAt(0);
        char end = pass.charAt(pass.length() - 1);

        if (first >= 'A' && first <= 'Z')
            System.out.println("Password is valid");
        else if (end >= 'a' && end <= 'z')
            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");
    }
}
