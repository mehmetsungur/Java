package day14arrays;
import java.util.Arrays;
public class Arrays04 {
    public static void main(String[] args) {
        String s = "asdas adsada sdad ad asdada dsa d";
        String [] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        String letters[] = s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);
    }
}
