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
            System.out.print("Please Select the Action: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    learning();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdrawal();
                    break;
                case 4:
                    System.out.println("Exit is Done - See You Soon");
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
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

        balence += Double.valueOf(depositPrice);
        System.out.println("New Balance: " + balence + " ₺");
    }
    private static void withdrawal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw:");
        double withdrawPrice = scanner.nextDouble();

        if (withdrawPrice > balence) {
            System.out.println("Insufficient Funds");
        } else {
            balence -= Double.valueOf(withdrawPrice);
            System.out.println("New Balance: " + balence + " ₺");
        }
    }
}
