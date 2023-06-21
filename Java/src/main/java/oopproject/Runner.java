package oopproject;

public class Runner {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        Worker worker = new Worker();
        Secretary secretary = new Secretary();
        Manager manager = new Manager();

        Worker worker1 = new Secretary();
        System.out.println(((Secretary) worker1).calculateSalary(true));

        salaryCalculator.companySalaryCalculator(worker);
    }
}
