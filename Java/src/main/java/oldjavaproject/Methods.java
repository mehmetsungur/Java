package oldjavaproject;

import java.util.Scanner;

public class Methods {
    public  double money(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Money: ");
        double money = scanner.nextDouble();
        return money;
    }

    public double select(Products products){
        System.out.println(products.toString());
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Attention! '0' for Exit");
            System.out.print("Product's Number: ");
            products.setProductNum(scanner.nextInt());

            if (products.getProductNum() < 0 || products.getProductNum() > 10){
                System.out.println("Invalid Number");
            }
        }while (products.getProductNum() < 0 || products.getProductNum() > 10);

        switch (products.getProductNum()){
            case 0:
                System.out.println("Thank you, See you later");
                break;
            case 1:
                products.setPrice(products.getSnicker());
                break;
            case 2:
                products.setPrice(products.getChipsAhoy());
                break;
            case 3:
                products.setPrice(products.getPringles());
                break;
            case 4:
                products.setPrice(products.getMilano());
                break;
            case 5:
                products.setPrice(products.getCocaCola());
                break;
            case 6:
                products.setPrice(products.getFanta());
                break;
            case 7:
                products.setPrice(products.getWater());
                break;
            case 8:
                products.setPrice(products.getArizona());
                break;
            case 9:
                products.setPrice(products.getSkittles());
                break;
        }
        return products.getPrice();
    }

    public double balance(double price, double money, Products products){
        while (money<price){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Invalid Balance (Y/N): ");

            char accept = scanner.next().toUpperCase().charAt(0);
            if (accept  == 'N'){
                System.out.println("Balance: " + money);
                System.out.println("Thank you, See you later");
            } else if (accept == 'Y') {
                System.out.print("Adding: ");
                double adding = scanner.nextDouble();
                money += adding;
                System.out.println("Account: $" + money);
                price = select(products);
            }else{
                System.out.println("Attention! Just valid character Y || N");
            }
        }

        return 0;
    }
}
