package oopproject;

public class Worker extends Person implements SalaryInterface {
    int baseSalary = 200;

    @Override
    public int calculateSalary() {
        System.out.println("Worker");
        return baseSalary+BONUS;
    }
}
