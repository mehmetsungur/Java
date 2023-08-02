package day18multidimensionalarray;
import java.util.Scanner;
public class Arrays01 {
    public static void main(String[] args) {
        String [][] names = {{"A","B"},{"C","D"},{"example","F"}};
        Scanner input = new Scanner(System.in);
        System.out.print("Value: ");
        String v = input.nextLine();

        for( String [] w : names){
            for (String k : w)
                if (k.contains(v)) {
                    System.out.print(k + " ");
                    break;
                }
                else{
                    System.out.println("Not Found");
                    break;
                }
                break;
        }
    }
}
