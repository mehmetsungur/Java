package day06stringmanipulations;
import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        String pwd =input.nextLine();

        boolean first = pwd.length()>7;
            System.out.println("Is charter count higher than 8: " + first);

        boolean second = !pwd.contains(" ");
        System.out.println("Is there contain space: " + second);

        boolean third =pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("Is there contain high chart: " + third);

        boolean fourth =pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("Is there contain low chart: " + fourth);

        boolean fifth =pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("Is there contain digit chart: " + fifth);

        boolean pwdtrue = first && second && third && fourth && fifth;
        System.out.println("Is password passed TRUE: " + pwdtrue);
    }
}
