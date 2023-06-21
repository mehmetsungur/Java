package oopproject;

public class Secretary extends Worker implements SalaryInterface {
    int baseSalary = 300;

    private int age;
    private String department;

    @Override
    public int calculateSalary() {
        System.out.println("Secretary");
        return baseSalary+BONUS;
    }

    int calculateSalary(boolean isSuccessful) {
        System.out.println("Secretary 2. method");
        if(isSuccessful){
            return (baseSalary+BONUS)*2;
        }else {
            return (baseSalary+BONUS)/2;
        }
    }
}
