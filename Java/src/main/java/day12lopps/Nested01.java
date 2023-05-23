package day12lopps;
import java.util.Scanner;

public class Nested01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Row: ");
        int row = input.nextInt();

        System.out.print("Column: ");
        int column = input.nextInt();

        for (int i=row;i>=0;i--){
            for (int j=i;j>=0;j--){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
