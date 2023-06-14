package day26polymorhphism;

public class Cat extends Animal {
    public void meow() {
        System.out.println("Cats meow");
    }

    @Override
    public void drink() { System.out.println("Cats drink .."); }

    @Override
    public Animal create() { return new Cat(); }

    @Override
    public int Add(int a, int b) {
        return a+b;
    }
}