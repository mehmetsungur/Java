package day06stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Laptop: ");
        String laptop = input.nextLine();
        System.out.println("Laptop Price: $" + laptop);

        System.out.print("Mouse: ");
        String mouse = input.nextLine();
        System.out.println("Mouse Price: $" + mouse);

        mouse = mouse.replace("$","");
        laptop = laptop.replace("$","");

        double totalPrice = Double.valueOf(mouse) + Double.valueOf(laptop);
        System.out.println("\nTotal Price: $" + totalPrice);

        System.out.print("Name: ");
        String name = input.nextLine();
        char n = name.toUpperCase().trim().charAt(0);
        System.out.println("Name's First Chart: " + n);

        System.out.print("Surname: ");
        String surname = input.nextLine();
        char s = surname.toUpperCase().trim().charAt(0);
        System.out.println("Surname's First Chart: " + s);

        System.out.print("Name Surname: ");
        String ns = input.nextLine();
        char nn = ns.toUpperCase().trim().charAt(0);
        char ss = ns.toUpperCase().trim().split(" ")[1].charAt(0);
        System.out.println("Surname's Name and Surname First Charts: " + nn + " and " + ss);
    }
}
