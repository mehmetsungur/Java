package day12lopps;
import java.util.Scanner;
public class Loops02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String: ");
        String str = input.nextLine();
        Reverse(str);
        RReverse(str);

        System.out.println("RReverse:" + RReverse(str));
    }
    private static void Reverse(String str){
        StringBuilder reverse = new StringBuilder();

        for(int i=str.length()-1 ; i>=0 ; i--){
            reverse.append(str.charAt(i));
        }

        System.out.println("Reverse:" + reverse);
    }
    private static String RReverse(String str){
        StringBuilder reverse = new StringBuilder();

        for(int i=str.length()-1 ; i>=0 ; i--){
            reverse.append(str.charAt(i));
        }

        return reverse.toString();
    }
}
