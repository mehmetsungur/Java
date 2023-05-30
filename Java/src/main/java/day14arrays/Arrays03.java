package day14arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        String [] names = new String[5];
        names[0] = "a";
        names[1] = "b";
        names[2] = "c";
        names[3] = "d";
        names[4] = "e";

        Scanner input = new Scanner(System.in);
        System.out.print("Value: ");
        String in = input.nextLine();

        Arrays.sort(names);
        int result = Arrays.binarySearch(names,in);

        if (result < 0)
            System.out.println("Fail");
        else
            System.out.println("Done");
    }
}
