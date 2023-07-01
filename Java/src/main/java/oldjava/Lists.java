package oldjava;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scan.nextLine().replace(" ","").toUpperCase();

        for (int i=0;i<name.length();i++){
            list.add(name.charAt(i));
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
