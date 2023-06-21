package day27practice;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        //kullanıcıdan aldiginiz veriyi stringbuilder objesine atayın
        //capasity lenght yazdırın
        //capasity i lenghte esıtleyın tekrar yazdırın
        //ikinci bir stringbuilder objesi olusturun, kullanıcıdaan aldıgınız veriyi atayın
        //iki objeyi karsılastırın(== , equals , compareTo ile)

        Scanner scan = new Scanner(System.in);
        System.out.print("Word: ");
        String word = scan.nextLine();

        StringBuilder sB = new StringBuilder(word);
        System.out.println(sB);
        System.out.println("Capacity: " + sB.capacity()); // Default Value's 16 without parameter
        System.out.println("Length: " + sB.length()); // if use with parameter capacity=sB+length
        System.out.println();
        sB.trimToSize(); // equals capacity and length
        System.out.println("Capacity: " + sB.capacity());
        System.out.println("Length: " + sB.length());
    }
}
