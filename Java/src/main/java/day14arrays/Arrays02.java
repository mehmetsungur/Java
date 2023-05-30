package day14arrays;

import java.util.Scanner;

public class Arrays02 {
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
        int count = 0;

        for (String w : names){
            if (w.equals(in)){
                count++;
            }
        }
        if (count > 0)
            System.out.print("Done");
        else
            System.out.print("Fail");
    }
}
