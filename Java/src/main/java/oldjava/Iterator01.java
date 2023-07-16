package oldjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        System.out.println();

        Iterator<String> iterator1 = list1.iterator();
        while (iterator1.hasNext()){
            iterator1.next();
            iterator1.remove();
        }
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("k");
        list2.add("l");
        list2.add("m");
        list2.add("n");
        System.out.println(list2);

        ListIterator<String> listIterator = list2.listIterator();
        while (listIterator.hasNext()){
            String el = listIterator.next();
            listIterator.set(el + "!");
            listIterator.add(el);
        }
        System.out.println(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("a");
        list3.add("aa");
        list3.add("aaa");
        list3.add("aaaa");
        System.out.println(list3);
        ListIterator<String> listIterator1 = list3.listIterator();
        while (listIterator1.hasNext()){
            listIterator1.next();
        }
        while (listIterator1.hasPrevious()){
            String el = listIterator1.previous();
            System.out.print(el + " ");
        }
        System.out.println();

        List<String> list4 = new ArrayList<>();
        list4.add("a");
        list4.add("aa");
        list4.add("aaa");
        list4.add("aaaa");
        System.out.println(list3);
        ListIterator<String> it4 = list4.listIterator();
        while (it4.hasNext()){
            String el = it4.next();
            it4.next();
            it4.set("*" + el);
        }
        while (it4.hasPrevious()){
            String el = it4.previous();
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println(list4);
    }
}
