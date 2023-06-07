package day22arraylists;

import java.util.List;

public class Array01 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,5,2,4,2);

        for (int w:nums){
            if (nums.indexOf(w) == nums.lastIndexOf(w))
                System.out.println(w);
        }

        System.out.println("*****************");

        int count = 0;
        for (int w:nums){
            if (nums.indexOf(w) != nums.lastIndexOf(w))
                count++;
        }

        if (count == 0){
            System.out.println("List is Unique!");
        }
        else
            System.out.println("List is not Unique");
    }
}
