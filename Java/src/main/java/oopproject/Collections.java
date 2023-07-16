package oopproject;

import java.util.List;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        List<String> ll1 = new LinkedList<>();
        ll1.add("A");
        ll1.add("B");
        ll1.add("C");
        ll1.add("D");
        System.out.println(ll1);

        ll1.add(1,"Kemal");
        System.out.println(ll1);

        List<String> ll2 = new LinkedList<>();
        ll2.add("X");
        ll2.add("Y");

        /*
            addAll() methodu linked list' e ArrayList' den gelen, LisnkedList' den gelen kısacası
            tüm collection' lardan gelen elemanları ekleyebilir.
        */

        ll1.addAll(ll2);
        System.out.println(ll1);

        ll1.addAll(2,ll2);
        System.out.println(ll1);
    }
}
