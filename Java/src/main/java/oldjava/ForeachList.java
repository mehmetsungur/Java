package oldjava;

import java.util.*;

public class ForeachList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);

        Collections.sort(numbers);

        for (int i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println();

        for(Integer w: numbers){
            System.out.print(w + " ");
        }
    }
}
