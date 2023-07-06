package oldjavaproject;

public class Runner {
    public static void main(String[] args) {
        Products products = new Products();

        Methods methods = new Methods();
        double money = methods.money();
        System.out.println("Account: $" + money);
        methods.select(products);
        methods.balance(products.getPrice(), money, products);
        methods.purchase(products.getPrice(),money,products);
    }
}