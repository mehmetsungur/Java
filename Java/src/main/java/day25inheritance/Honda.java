package day25inheritance;

public class Honda extends Car {
    public Honda() {
        System.out.println("this.km" + this.km);
        System.out.println("super.km" + super.km);
        System.out.println("Honda 1");
    }

    public Honda(String make, int year) {
        System.out.println("Honda 2");
    }

    public int km=10000;
}
