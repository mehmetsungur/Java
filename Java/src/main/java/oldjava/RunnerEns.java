package oldjava;

public class RunnerEns {
    public static void main(String[] args) {
        Encapsulations ens = new Encapsulations();

        System.out.println(ens.getAge());
        System.out.println(ens.getName());

        ens.setAge(32);
        System.out.println(ens.getAge());

        ens.setName("Sungur");
        System.out.println(ens.getName());
    }
}
