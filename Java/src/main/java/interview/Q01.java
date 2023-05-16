package interview;
import java.util.Scanner;
public class Q01 {
    //Bakiye (başlangıç 1000 ₺) öğrenme, para yatırma ve çekme, çıkış işlemlerinin yapıldığı bir ATM uygulama method create ediniz.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        while (choose != 4) {
            System.out.println("\nBalance Learning - 1");
            System.out.println("Deposit - 2");
            System.out.println("Withdrawal - 3");
            System.out.println("Exit - 4");
            System.out.print("\nPlease Select the Action: ");
            choose = scanner.nextInt();

            if (choose == 1)
                learning();
            else if (choose == 2)
                deposit();
            else if (choose == 3)
                withdrawal();
            else if (choose == 4)
                System.out.println("Exit is Done - See You Soon");
            else
                System.out.println("Invalid Selection");
        }
    }
    private static double balence = 1000;
    private static void learning() {
        System.out.println("Balance: " + balence + " ₺");
    }
    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit: ");
        double depositPrice = scanner.nextDouble();

        balence += depositPrice;
        System.out.println("New Balance: " + balence + " ₺");
    }
    private static void withdrawal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw:");
        double withdrawPrice = scanner.nextDouble();

        if (withdrawPrice > balence) {
            System.out.println("Insufficient Funds");
        }
        else {
            balence -= withdrawPrice;
            System.out.println("New Balance: " + balence + " ₺");
        }
    }
}
