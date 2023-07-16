package oopproject;

import java.util.HashSet;

public class HashSet01 {
    /*
        1) Tekrarlı elemana müsaade edilmez.
            Set' lerin içinde bir eleman sadece 1 kere kullanılabilir.
        2) HashSet' ler Set' ler arasında en hızlı olanıdır.
        3) HashSet elemanları sıralamak ile uğraşmaz. Rastgele sıralama yapılır.
        4) HashSet "null" object' ini eleman olarak kullanılabilir.
    */
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("A");
        hs1.add("B");
        hs1.add("C");
        hs1.add("E");
        hs1.add("D");
        // HashSet' e tekrarlı eleman yollarsanız üzerine yazar.
        hs1.add("E");
        hs1.add(null);

        System.out.println(hs1);
    }
}
