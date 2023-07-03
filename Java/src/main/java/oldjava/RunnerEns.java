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

        Ens01 obj01 = new Ens01();
        obj01.setNum(38);
        System.out.println(obj01.getNum());
        System.out.println(obj01.getName());

    }
}
