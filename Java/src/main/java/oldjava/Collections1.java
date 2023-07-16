package oldjava;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Collections1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        System.out.println(ll);

        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        String isim = scan.nextLine();

        if(ll.remove(isim)){
            System.out.println("Silindi");
            System.out.println(ll);
        }
        else{
            System.out.println("Ne Hırsızı");
            System.out.println(ll);
        }

        HashSet<String> hs1 = new HashSet<>();
        System.out.println(hs1.hashCode());
    }
}
