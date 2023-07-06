package oldjavaproject;

public class Runner {
    public static void main(String[] args) {
        Products products = new Products();

        Methods methods = new Methods();
        double money = methods.money();
        System.out.println("Account: $" + money);
        System.out.println(methods.select(products));
    }
}
