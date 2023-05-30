package day14arrays;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        int [] a = {0,2,3,0,5,0};
        int [] b = new int[a.length];

        int index = 0;
        for (int w : a)
            if (w!=0){
                b[index] = w;
                index++;
            }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
