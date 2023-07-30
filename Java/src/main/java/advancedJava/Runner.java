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

        Advanced02<String> obj03 = new Advanced02<>();
        obj03.setField("Generic Types");
        String str1 = obj03.getField();

        Advanced02<Integer> obj04 = new Advanced02<>();
        obj04.setField(646);
        Integer num1 = obj04.getField();
    }
}