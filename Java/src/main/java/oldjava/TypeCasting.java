package oldjava;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Day: ");
        String day = scan.next();

        if(day.equalsIgnoreCase("Cuma"))
            System.out.println("Muslim");
        else if (day.equalsIgnoreCase("Cumartesi"))
            System.out.println("Indian");
        else if (day.equalsIgnoreCase("Pazar"))
            System.out.println("Christian");
        else
            System.out.println("Invalid Day");
    }
}
