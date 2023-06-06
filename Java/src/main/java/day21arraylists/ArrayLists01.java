package day21arraylists;
import java.util.ArrayList;
public class ArrayLists01 {
    public static void main(String[] args) {
        /*
        1) Ayni data type indaki coklu datalari depolamak icin Array kullaniriz
        2) Arraylerin negatif bir yonu var, icine koyacağınız eleman sayisini en basta belirlemek zorundasiniz
        3) Arrayler eleman sayisinda esnek degildirler, bu yuzden java Arraylist adli yeni bir yapi olusturdu
        Bu yapi eleman sayisinda esnekdir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar,
        1000 eleman koyarsaniz eleman sayisni 1000 olarak ayarlar
        4) Arraylist yerine sadece List de diyebilirsiniz
        5) Java Arraylistleri olusturduktan sonra Array leri iptal etmedi cunku;
            a)Array ler super hizlidir.
            b)Array ler memory de cok az yer kaplar.
            c)Bu nedenle eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir
        6) Arrayler pirimitive data type lari ve "reference" lari depolayabilir.
           Ama ArrayList ler non-primitive data type lari depolar, bu nedenle Arraylistler Arraylerden daha fazla yer kaplarlar
         */

        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<Integer>();

        //Arraylist console a nasil yazdirilir?
        System.out.println(ages);

        //Arraylist lere eleman nasil eklenir?
        //Arraylist lere eleman eklemek icin add()methodunu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada "list"e ekler (insertion order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888]

        //List'e coklu eleman nasil eklenir? veya Liste baska bir list nasil eklenir?
        //Bir list e coklu eleman eklemek icin o elemanlari oncelikle bir listin icine koymalisiniz
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);//[8, 9, 10]

        ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages);

        int num1 = ages.get(1);
        System.out.println(num1);

        ages.set(1,2132);
        System.out.println(ages);

        ages.clear();
        System.out.println(ages);

        //Dizin içerisinde bir veriyi kontrol etmek
        boolean r = ages.contains(313);
        System.out.println(r);

        boolean b = ages.isEmpty();
        System.out.println(b);
    }
}