package oldjava;

import interview.AcMo03;

public class AcMo02 {
    public static void main(String[] args) {
        AcMo01 obj01 = new AcMo01();
        System.out.println(obj01.publicAge);
        System.out.println(obj01.protectedAge);
        System.out.println(obj01.defaultAge);

        AcMo03 obj02 = new AcMo03();
        System.out.println(obj02.publicName);
    }
}
