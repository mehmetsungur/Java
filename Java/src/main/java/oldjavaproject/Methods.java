package oldjavaproject;

import java.util.Scanner;

public class Methods {
    public double select(Products products){
        System.out.println(products.toString());
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Product's Number: ");
            products.setProductNum(scanner.nextInt());

            if (products.getProductNum() < 1 || products.getProductNum() > 10){
                System.out.println("Invalid Number");
            }
        }while (products.getProductNum() < 1 || products.getProductNum() > 10);

        return 0;
    }
}
