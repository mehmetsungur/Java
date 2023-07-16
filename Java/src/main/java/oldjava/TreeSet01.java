package oldjava;

import java.util.TreeSet;

public class TreeSet01 {
    /*
        1) TreeSet tekrarlı eleman kabul etmez, çünkü Setr' tir.
        2) Elemanları natural Order' a göre dizer.
        3) TreeSet, setlerin en yavaşıdır.
    */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        TreeSet<String> tr = new TreeSet<>();
        tr.add("A");
        tr.add("B");
        tr.add("C");
        tr.add("D");
        long endTime = System.currentTimeMillis();
        System.out.println(tr);
        System.out.println(endTime-startTime);
    }
}
