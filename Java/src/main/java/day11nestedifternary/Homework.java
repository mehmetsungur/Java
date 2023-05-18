package day11nestedifternary;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İsim Soyisim");
        String name = input.nextLine();

        String fname = name.split(" ")[0];
        String sname = name.split(" ")[1];

        System.out.println(fname);
        System.out.println(sname);
    }
}
