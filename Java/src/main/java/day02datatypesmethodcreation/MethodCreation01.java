package day02datatypesmethodcreation;

import java.sql.SQLOutput;

public class MethodCreation01 {
    public static void main(String[] args) {
           int sum = sumMake(3,5);
           int extraction = extractionMake(3,5);
           int impact = impactMake(3,5);
           int partition = partitionMake(3,5);
           print("Enter of Values");

           System.out.println("Sum of Method= " + sum);
           System.out.println("Extraction of Method= " + extraction);
           System.out.println("Impact of Method= " + impact);
           System.out.println("Partition of Method= " + partition);
        }

    public static int sumMake(int a, int b){
        return a+b;
    }

    protected static int extractionMake(int a, int b){
        return a-b;
    }

    private static int impactMake(int a, int b){
        return a*b;
    }

    static int partitionMake(int a, int b){
        return a/b;
    }

    public static void print(String str){
        System.out.println(str);
    }
}
