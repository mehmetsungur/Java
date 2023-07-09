package oldjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("c");
        list.add("b");
        System.out.println(list);

        //List elemanlarını for ve foreach ile yazdir.
        for (int i=0;i<list.size();i++) System.out.print(list.get(i) + " ");
        System.out.println();
        for(String w:list) System.out.print(w + " ");
        System.out.println();

        //List for kullanarak eleman sonuna "!" işareti koyarak yazınız.
        for (int i=0;i<list.size();i++){
            list.set(i, list.get(i) + "!");
        }
        System.out.println(list);

        //List foreach kullanarak eleman sonuna "!" işareti koyarak yazınız.
        for (String w:list){
            w += "!";
        }
        System.out.println(list);

        /*
        for loop kullanmadan list' leri update edebilmek içi iterator' larda kullanılabilir.
         */

        List<String> list1 = new ArrayList<>();
        list1.add("h");
        list1.add("x");
        list1.add("w");
        list1.add("y");
        System.out.println(list1);

        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()){
            String el = iterator.next();
            System.out.print(el + " ");
        }
    }
}
