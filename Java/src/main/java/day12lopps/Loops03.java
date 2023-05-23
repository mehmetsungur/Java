package day12lopps;
import java.util.Scanner;
public class Loops03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String: ");
        String str = input.nextLine();

        Middle(str);
        System.out.println("Middle: " + str);

        Junior(str);
        System.out.println("Junior: " + str);
    }
    private static String Middle(String str){
        StringBuilder reverse = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            reverse.append(str.charAt(i));
        }
        String result = reverse.toString();
        return result;
    }
    private static String Junior(String str){
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
