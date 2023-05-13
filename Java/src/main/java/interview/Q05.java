package interview;
import java.util.Scanner;
public class Q05 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi Char.Char.Char
        Scanner input = new Scanner(System.in);

        System.out.print("First Word: ");
        String first = input.nextLine();

        System.out.print("Second Word: ");
        String second = input.nextLine();

        System.out.print("Third Word: ");
        String third = input.nextLine();

        char f = first.toUpperCase().charAt(0);
        char s = second.toUpperCase().charAt(0);
        char t = third.toUpperCase().charAt(0);

        System.out.println("Result: " + f + "." + s + "." + t + ".");
    }
}
