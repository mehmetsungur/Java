package oldjavaproject;

public class Runner {
    public static void main(String[] args) {
        Products products = new Products();

        Methods methods = new Methods();
        methods.select(products);
    }
}
