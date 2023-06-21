package oopproject;

public class Manager extends Secretary {
    int baseSalary = 400;
    String project;

    @Override
    public int calculateSalary() {
        System.out.println("Manager");
        return baseSalary+BONUS;
    }
}
