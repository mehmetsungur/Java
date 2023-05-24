package day13nested;
import java.util.Scanner;
public class Loops01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin terim sayısını girin: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Serisi (" + n + " terim):");
        for (int i = 0; i < n; i++) {
            int fib = fibonacci(i);
            System.out.print(fib + " ");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
