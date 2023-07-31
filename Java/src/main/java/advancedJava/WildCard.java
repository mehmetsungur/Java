package advancedJava;

import java.util.ArrayList;
import java.util.List;

//wildcard(joker:?): bilinmeyen data tipi
public class WildCard {
     public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();

        // Alttan sınırlandırma yapıldı.
        addElements(integerList);
        System.out.println(integerList);

        addElements(numberList);
        addElements(objectList);

        // CTE; String ve Double integer parentları değil.
        //addElements(stringList);
        //addElements(doubleList);

         multiplByTwo(integerList);
         multiplByTwo(doubleList);
         multiplByTwo(numberList);

         // CTE; String ve Double integer parentları değil.
         //multiplByTwo(stringList);
         //multiplByTwo(objectList);
     }

     //listeye sadece integer veya parentları ile oluşturulan listeye
     //1 den 10 a kadar elemanları ekleyen bir method
     //Integer, Number, Object

     public static void addElements(List<? super Integer> list){
         for(int i=1;i<=10;i++){
             list.add(i);
         }
     }

     public static void multiplByTwo(List<? extends Number> list){
         list
                 .stream()
                 .map(t->2*t.doubleValue())
                 .forEach(t-> System.out.print(t + " "));
     }
}
