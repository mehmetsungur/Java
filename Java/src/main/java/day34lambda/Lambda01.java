package day34lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(12);
        nums.add(21);
        nums.add(5);
        nums.add(7);

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printElements3(nums);
        System.out.println();
        printElements4(nums);
        System.out.println();
        printElements5(nums);
        System.out.println();
        printElements6(nums);
        System.out.println();
        printElements7(nums);
        System.out.println();
        printElements8(nums);
        System.out.println();
        printElements9(nums);
        System.out.println();
        printElements10(nums);
        System.out.println();
        printElements11(nums);
        System.out.println();
        printElements12(nums);
    }

    public static void printElements1(List<Integer> nums){
        for(Integer w:nums){
            System.out.print(w + " ");
        }
    }

    public static void printElements2(List<Integer> nums){
        nums.stream().forEach(t->System.out.print(t + " "));
    }

    public static void printElements3(List<Integer> nums){
        for(Integer w:nums){
            if(w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    public static void printElements4(List<Integer> nums){
        nums.stream().filter(t->t%2==0).forEach(t->System.out.print(t + " "));
    }

    public static void printElements5(List<Integer> nums){
        nums
                .stream()
                .filter(t -> t % 2 != 0)
                .map(t -> t*t)
                .forEach(t -> System.out.print(t + " "));
    }

    public static void printElements6(List<Integer> nums){
        long started = System.nanoTime();

        nums
                .stream()
                .distinct()
                .sorted()
                .filter(t -> t % 2 != 0)
                .map(t -> t*t*t)
                .forEach(t -> System.out.print(t + " "));

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static void printElements7(List<Integer> nums){
        long started = System.nanoTime();

        nums
                .stream()
                .filter(t -> t % 2 != 0)
                .map(t -> t*t*t)
                .distinct()
                .sorted()
                .forEach(t -> System.out.print(t + " "));

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static void printElements8(List<Integer> nums){
        long started = System.nanoTime();

        Integer sums = nums
                .stream()
                .distinct()
                .sorted()
                .filter(t -> t % 2 != 0)
                .map(t -> t*t*t)
                .reduce(0,(t,u)->t+u);
        System.out.print(sums);

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static void printElements9(List<Integer> nums){
        long started = System.nanoTime();

        Integer multiply = nums
                .stream()
                .distinct()
                .sorted()
                .filter(t -> t % 2 == 0)
                .map(t -> t*t)
                .reduce(1,(t,u)->t*u);
        System.out.print(multiply);

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static void printElements10(List<Integer> nums){
        long started = System.nanoTime();

        Integer maxNums = nums
                .stream()
                .distinct()
                .reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
        System.out.print(maxNums);

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static void printElements11(List<Integer> nums){
        long started = System.nanoTime();

        Integer mamNums = nums
                .stream()
                .distinct()
                .reduce(nums.get(0),(t,u)->t>u?t:u);
        System.out.print(mamNums);

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static void printElements12(List<Integer> nums){
        long started = System.nanoTime();

        Integer maxNums = nums
                .stream()
                .distinct()
                .sorted()
                .reduce((t,u)->u).get();
        System.out.print(maxNums);

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }
}
