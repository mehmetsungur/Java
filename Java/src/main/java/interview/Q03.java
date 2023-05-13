package interview;
import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Sentences: ");
        String str = input.nextLine();

        boolean status = str.contains(" ");
        System.out.print("Space Status: " + status);
    }
}
