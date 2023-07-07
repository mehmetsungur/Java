package oldjava;

public class Civic extends Honda implements IcDonanim, Lastik{
    @Override
    public void hareket() {
        System.out.println("Hızlı ve Ekonomik");
    }

    @Override
    public void koltuk() {
        System.out.println("Civic Koltuk");
    }

    @Override
    public void direksiyon() {
        System.out.println("Civic Direksiyon");
    }

    @Override
    public void ayna() {
        System.out.println("Civic Ayna");
    }

    @Override
    public void far() {
        System.out.println("Civic Far");
    }

    @Override
    public void kaporta() {
        System.out.println("Civic Kaporta");
    }

    @Override
    public void garanti() {

    }

    @Override
    public void jant() {

    }
}