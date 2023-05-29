package day16arrays;
import java.util.Arrays;
public class Arrays04 {
    public static void main(String[] args) {
        String [] newArray = new String[5];
        System.out.println(Arrays.toString(newArray));

        newArray[0] = "Ali";
        newArray[1] = "Ayşe";
        newArray[2] = "Mehmet";
        newArray[3] = "Abdullah";
        newArray[4] = "Enes";

        int sum = 0;
        for (String w : newArray){
            sum += w.length();
        }
        System.out.println(sum);
    }
}
