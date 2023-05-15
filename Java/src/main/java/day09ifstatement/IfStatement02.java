package day09ifstatement;
import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println("Number is Double");

        else
            System.out.println("Number is Single");
    }
}
