package day11nestedifternary;
import java.util.Scanner;
public class NestedIf01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gender(M/W): ");
        String gender = input.nextLine();
        System.out.print("Age: ");
        int age = input.nextInt();

        if (age > 0 && age < 120)
        {
            if (gender.equalsIgnoreCase("M"))
            {
                if (age >= 65)
                    System.out.println("Gender is Man. He can be retired.");
                else
                    System.out.println("Gender is Man. He can not be retired.");
            }

            else if (gender.equalsIgnoreCase("W"))
            {
                if (age >= 60)
                    System.out.println("Gender is Woman. She can be retired.");
                else
                    System.out.println("Gender is Man. She can not be retired.");
            }
            
            else
                System.out.println("Gender is invalid.");
        }
        else
            System.out.println("Age is invalid");
    }
}
