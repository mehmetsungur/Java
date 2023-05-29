package day16arrays;

import java.util.Arrays;

public class Arrays06 {
    public static void main(String[] args) {
        int [] sort = new int[3];

        sort[0] = 1;
        sort[1] = 2;
        sort[2] = 3;

        int min = sort[0];
        int max = sort[sort.length-1];
        for (int w : sort) {
            min = Math.min(min, w);
            max = Math.max(max, w);
        }
        System.out.println(min+max);

        Arrays.sort(sort);
        min = sort[0];
        max = sort[sort.length-1];

        System.out.println(min+max);
    }
}
