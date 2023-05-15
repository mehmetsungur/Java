package day09ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        number = Math.abs(number);

        if (number > 99 && number < 1000)
            System.out.println("Girilen sayı 3 basamaklıdır!");
        else
            System.out.println("Girilen sayı 3 basamaklı değildir!");
    }
}
