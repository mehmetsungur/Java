package day09ifstatement;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Note: ");
        double note1 = input.nextDouble();
        System.out.print("2. Note: ");
        double note2 = input.nextDouble();
        System.out.print("3. Note: ");
        double note3 = input.nextDouble();

        double average = (note1+note2+note3)/3;

        if (average >= 50)
            System.out.println("Average Note: " + average + " Result: PASSED");
        else
            System.out.println("Average Note: " + average + " Result: NOT PASSED");
    }
}
