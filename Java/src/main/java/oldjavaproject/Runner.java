package oldjavaproject;

public class Runner {
    public static void main(String[] args) {
        Products products = new Products();
        Methods methods = new Methods();
        System.out.println("Welcome");
        double money = methods.money();
        System.out.println("Account: $" + money);

        products.setPrice(methods.select(products));
        money = methods.balance(products.getPrice(), money, products);
        methods.purchase(products.getPrice(),money,products);
    }
}