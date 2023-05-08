package day05tries;

import java.util.Scanner;
public class Avarage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first your number: ");
        int first = input.nextInt();

        System.out.print("Enter second your number: ");
        int second = input.nextInt();

        System.out.print("Enter third your number: ");
        int third = input.nextInt();

        int average = (first + second + third) / 3;
        System.out.print("Average of Numbers: " + average);
    }
}
