package advancedJava;

public class Runner {
    public static void main(String[] args) {
        Advanced01 obj01 = new Advanced01();
        Advanced01 obj02 = new Advanced01();

        obj01.setField("Advanced Java");
        obj02.setField(12);

        String str = (String) obj01.getField();
        System.out.println(str);

        int num = (int) obj01.getField();
        System.out.println(num);
    }
}