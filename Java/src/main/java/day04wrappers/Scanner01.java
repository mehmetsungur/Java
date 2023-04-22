package day04wrappers;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rectangle short value: ");
        double shortValue = scanner.nextDouble();
        System.out.print("Rectangle long value: ");
        double longValue = scanner.nextDouble();

        double env = env(shortValue, longValue);
        double field = field(shortValue, longValue);

        System.out.println("Result of Environment: " + env);
        System.out.println("Result of Field: " + field);
    }

    public static double env(double shortValue, double longValue) {
        return 2 * (shortValue + longValue);
    }

    public static double field(double shortValue, double longValue) {
        return shortValue * longValue;
    }
}
