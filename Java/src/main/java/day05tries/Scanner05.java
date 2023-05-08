package day05tries;

import java.util.Scanner;
public class Scanner05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number: ");
        int number = input.nextInt();

        System.out.println("Entered Number: " + number);

        // Number Decrease
        int decNumber = number / 10;
        int dec2Dumber = decNumber / 10;

        // Finding the tens digit with a decreasing number
        int hundredsDigit = dec2Dumber % 10;
        System.out.println("HundredsDigit Number: " + hundredsDigit);

        // Finding the tens digit with a decreasing number
        int tensDigit = decNumber % 10;
        System.out.println("TensDigit Number: " + tensDigit);

        // Finding the ones digit with a number
        int onesDigit = number % 10;
        System.out.println("OnesDigit Number: " + onesDigit);

        // Sum of tens and ones digits
        int result =  hundredsDigit + tensDigit + onesDigit;
        System.out.println("Result: " + result);
    }
}
