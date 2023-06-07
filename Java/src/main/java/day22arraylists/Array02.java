package day22arraylists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Array02 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(10);
        nums.add(9);
        nums.add(19);
        Collections.sort(nums);
        int minDiff = nums.get(1)-nums.get(0);
        int maxDiff = nums.get(1)-nums.get(0);
        int max = nums.get(nums.size()-1)-nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            minDiff = Math.min(minDiff,nums.get(i)-nums.get(i-1));
        }

        for (int i = 1; i < nums.size(); i++) {
            maxDiff = Math.max(maxDiff,nums.get(i)-nums.get(i-1));
        }

        System.out.println("Min Diff: " + minDiff);
        System.out.println("Max Diff: " + maxDiff);
        System.out.println("End-First Diff: " + max);
    }
}
