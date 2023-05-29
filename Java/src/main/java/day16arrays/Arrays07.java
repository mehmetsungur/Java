package day16arrays;
import java.util.Arrays;

public class Arrays07 {
    public static void main(String[] args) {
        String [] colors = new String[6];
        colors[0] = "A";
        colors[1] = "B";
        colors[2] = "C";
        colors[3] = "D";
        colors[4] = "E";
        colors[5] = "F";

        System.out.println(Arrays.toString(colors));

        for (String w : colors){
            if (w.equals("C"))
                break;
            System.out.println(w);
        }
    }
}
