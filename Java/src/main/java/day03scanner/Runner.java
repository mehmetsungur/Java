package day03scanner;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Model: " + car.model + "\n" + "Price: " + car.price);
        car.move();
        car.stop();

        System.out.println("\n****************\n");

        Student student = new Student();
        System.out.println("Name: " + student.name + "\n" + "Number: " + student.number);
        student.status();

        System.out.println("\n****************\n");
    }
}