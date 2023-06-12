package day24stringbuilder;
public class sb01 {
    public static void main(String[] args) {
        StringBuilder sb01 = new StringBuilder("Java is easy");
        System.out.println(sb01);

        sb01.reverse();
        System.out.println(sb01);

        sb01.deleteCharAt(0);
        System.out.println(sb01);

        sb01.delete(4,6);
        System.out.println(sb01);

        sb01.replace(4,6, "");
        System.out.println(sb01);

        sb01.insert(4,"MS");
        System.out.println(sb01);

        //Comporeto metodu baştan başlayarak herbir karakteri teker teker karşılaştırır.
        //Farklı olduğunda karakterin ASCII kodunda ne kadar önde olduğu bilgisini verir.
        StringBuilder sb02 = new StringBuilder("Java is easy");
        int r1 = sb01.compareTo(sb02);
        System.out.println(r1);

        //StringBuilder String Metodları ile kullanma
        String sb01Lower = sb01.toString().toLowerCase();
        String sb01Upper = sb01.toString().toUpperCase();
        System.out.println(sb01Lower);
        System.out.println(sb01Upper);

        //Stringi StringBuilder a Çevirme
        StringBuilder str = new StringBuilder(sb01Lower);
        System.out.println(str);
    }
}
