package example;
import java.util.ArrayList;
import java.util.List;
//wildcard: joker - ? Bilinmeyen Data Tipi
public class Wildcard {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();

        addElements(integerList);
        System.out.println(integerList);

        addElements(numberList);
        System.out.println(numberList);

        addElements(objectList);
        System.out.println(objectList);

        // Integer parent değil
        //addElements(doubleList);
        //System.out.println(doubleList);

        // Integer parent değil
        //addElements(stringList);
        //System.out.println(stringList);

        multiplyByTwo(integerList);
        System.out.println(integerList);

        multiplyByTwo(doubleList);
        System.out.println(doubleList);

        multiplyByTwo(numberList);
        System.out.println(numberList);

        // Üstten sınırlandırma yapıldı
        //multiplyByTwo(objectList);
        //System.out.println(objectList);
    }

    public static void addElements(List<? super Integer> list){
        for (int i=1;i<=10;i++){
            list.add(i);
        }
    }

    public static void multiplyByTwo(List<? extends Number> list){
        list.stream().map(t->2*t.doubleValue()).forEach(t-> System.out.print(t + " "));
        System.out.println();
    }
}
