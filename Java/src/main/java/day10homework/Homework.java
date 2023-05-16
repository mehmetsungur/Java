package day10homework;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        String pass = input.nextLine();

        if (pass.equals("pwd123!"))
            System.out.println("Password is correct!");
        else
            System.out.println("Password is invalid");
    }
}
