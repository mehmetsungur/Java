package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Ceylan");
        myList.add("Zebra");
        myList.add("Elif");
        myList.add("Bay");
        myList.add("Gel");
        myList.add("Elif");

        printElements01(myList);
        System.out.println();

        printElements02(myList);
        System.out.println();

        List<String> newList= printElements03(myList);
        System.out.println(newList);

        printElements04(myList);
        System.out.println();

        printElements05(myList);
        System.out.println();

        printElements06(myList);
        System.out.println();

        printElements07(myList);
        System.out.println();

        printElements08(myList);
        System.out.println();

        printElements09(myList);
        System.out.println();

        printElements10(myList);
        System.out.println();

        printElements11(myList);
        System.out.println();

        int sum = printElements12();
        System.out.println("Sum: " + sum);

        int sum1 = printElements13();
        System.out.println("Sum: " + sum1);
    }

    public static void printElements01(List<String> myList){
        myList
                .stream()
                .sorted()
                .filter(t -> !t.startsWith("E"))
                .forEach(t -> System.out.print( t + " "));
    }

    public static void printElements02(List<String> myList){
        myList
                .stream()
                .sorted()
                .distinct()
                .filter(t -> t.length() >= 5)
                .forEach(t -> System.out.print( t + " "));
    }

    public static List<String> printElements03(List<String> myList){
        return   myList.
                stream().
                filter(t->t.length()>5).
                map(t->t.toUpperCase()).
                collect(Collectors.toList());
    }

    public static void printElements04(List<String> myList){
        myList
                .stream()
                .distinct()
                .filter(t -> t.length() < 5)
                .map(t->t.toLowerCase())
                .sorted()
                .forEach(t -> System.out.print( t + " "));
    }

    public static void printElements05(List<String> myList){
        long started = System.nanoTime();

        myList
                .stream()
                .distinct()
                .filter(t -> t.length() < 5)
                .map(t->t.toUpperCase())
                .sorted()
                .forEach(t -> System.out.print( t + " "));


        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static void printElements06(List<String> myList){
        long started = System.nanoTime();

        myList
                .stream()
                .distinct()
                .map(t->t.toLowerCase())
                .sorted(Comparator.comparing(t->t.length()))
                .forEach(t -> System.out.print( t + " "));

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static void printElements07(List<String> myList){
        long started = System.nanoTime();

        myList
                .stream()
                .distinct()
                .map(t->t.toLowerCase())
                .sorted(Comparator.comparing(t->t.length()))
                .forEach(t -> System.out.print( t + " "));

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static void printElements08(List<String> myList){
        long started = System.nanoTime();

        myList
                .stream()
                .distinct()
                .map(String :: toLowerCase)
                .sorted(Comparator.comparing(t->t.length()))
                .forEach(t -> System.out.print( t + " "));

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static void printElements09(List<String> myList){
        long started = System.nanoTime();

        myList
                .stream()
                .distinct()
                .map(String :: toLowerCase)
                .sorted(Comparator.comparing(String::length))
                .forEach(Utils :: printForeachWithSpace);

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static void printElements10(List<String> myList){
        long started = System.nanoTime();

        myList.removeIf(t->t.length()>5);
        System.out.println(myList);

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static void printElements11(List<String> myList){
        long started = System.nanoTime();

        myList.removeIf(t->t.charAt(0) == 'Z' || t.charAt(t.length()-1) == 'f');
        System.out.println(myList);

        long stopped = System.nanoTime();
        long timer = stopped - started;
        System.out.print("\nWorking Time: " + timer + " ns");
    }

    public static int printElements12(){
        return IntStream.range(7,77)
                .reduce(Math :: addExact)
                .getAsInt();
    }

    public static int printElements13(){
        return IntStream.rangeClosed(3,9)
                .reduce(Math :: multiplyExact)
                .getAsInt();
    }
}

