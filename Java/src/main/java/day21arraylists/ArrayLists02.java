package day21arraylists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
        //Bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("A");
        names1.add("B");
        names1.add("C");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("D");
        names2.add("example");
        names2.add("F");

        ArrayList<String> names3 = new ArrayList<>();
        names3.add("D");
        names3.add("example");
        names3.add("F");

        boolean r = names1.equals(names2);
        System.out.println(r);

        boolean b = names2.equals(names3);
        System.out.println(b);

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(2);
        nums2.add(1);
        nums2.add(3);

        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean result = nums1.equals(nums2);
        System.out.println(result);

        // ArrayList de bir elemanın ilk görünümü nasıl silinir?
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Miami");
        cities.add("Barcelona");
        cities.add("Istanbul");
        cities.add("Miami");
        System.out.println(cities);

        cities.remove("Miami");
        System.out.println(cities);

        //ArrayList bir elemanın index kullanılarak silinmesi
        System.out.println(cities.remove(2));
        System.out.println(cities);

        //ArrayList oluştururken constructor bölümüne ArrayList konulur,
        //ancak sol tarafa List ifadeside yazılabilir.

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(2);
        ages.add(32);
        ages.add(3);

        Collections.sort(ages);
        System.out.println(ages.remove(0));
        System.out.println(ages);

        System.out.println(ages.remove(Integer.valueOf(12)));
        System.out.println(ages);

        //ArrayList deki elemanları silmek için
        List<String> citiesRemove = new ArrayList<>();
        citiesRemove.add("Istanbul");
        citiesRemove.add("Miami");
        cities.removeAll(citiesRemove);
        System.out.println(cities);
    }
}
