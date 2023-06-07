package day21arraylists;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        List<Character> characters = List.of('a','b','c','b');
        List<Integer> nums = List.of(1,2,3,4);
        List<String> names = List.of("A","B","C","D");

        int r1 = characters.indexOf('b');
        System.out.println(r1);

        int r2 = characters.lastIndexOf('b');
        System.out.println(r2);
    }
}
