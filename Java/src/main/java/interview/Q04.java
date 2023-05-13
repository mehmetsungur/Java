package interview;
import java.util.Scanner;
public class Q04 {
    public static void main(String[] args) {
        //Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Words: ");
        String str = input.nextLine();

        System.out.println("First Word: " + str.split(" ")[0]);
        System.out.println("Second Word: " + str.split(" ")[1]);
    }
}
