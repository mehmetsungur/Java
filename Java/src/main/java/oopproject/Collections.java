package oopproject;

import java.util.List;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
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

        // List LinkedList olarak değiştirildikten sonra addFirst ve addLast methodları geldi.
        ll1.addFirst("AAA");
        System.out.println(ll1);

        ll1.addLast("ZZZ");
        System.out.println(ll1);

        // İlk elemanı siler
        ll1.remove();
        System.out.println(ll1);

        // İlk elemanı daha hızlı siler
        ll1.removeFirst();
        System.out.println(ll1);

        // İlgili index i siler
        ll1.remove(1);
        System.out.println(ll1);
    }
}
