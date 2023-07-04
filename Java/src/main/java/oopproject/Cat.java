package oopproject;

public class Cat extends Animal{
    @Override //Annotation
    public void ses() {
        System.out.println("Kediler miyavlar");
    }

    @Override
    public int add() {
        return 1+2;
    }

    @Override
    public int multiply() {
        return 4*5;
    }

    @Override
    public Animal create() {
        return new Cat();
    }
}
