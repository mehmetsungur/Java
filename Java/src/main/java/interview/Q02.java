package interview;
import java.util.Scanner;
public class Q02 {
    //Kullanıcıdan alınan bir Stringin ilk ve son harfini yine kulanıcıdan alınan sayı kadar return eden metod yazınız.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Word: ");
        String word = scanner.next();

        System.out.print("How many letters do you want to buy: ");
        int letters = scanner.nextInt();

        String result = returnMethod(word, letters);
        System.out.println("Result: " + result);
    }
    public static String returnMethod(String word, int letters) {
        int wordLength = word.length();
        if (wordLength < letters) {
            return "Hata: Kelime " + letters + " harf içermiyor.";
        }

        String firstLetter = word.substring(0, 1);
        String endLetter = word.substring(wordLength - 1);
        String letter = firstLetter + endLetter;

        String result = "";
        for (int i = 0; i < letters; i++) {
            result += letter;
        }
        return result;
    }
}
