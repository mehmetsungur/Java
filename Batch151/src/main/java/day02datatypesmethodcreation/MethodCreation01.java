package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {
           int sum = sumMake(3,5);
           int extraction = extractionMake(3,5);
           int impact = impactMake(3,5);
           int partition = partitionMake(3,5);
           int mod = modMake(3,5);

           System.out.println("Sum of Method= " + sum);
           System.out.println("Extraction of Method= " + extraction);
           System.out.println("Impact of Method= " + impact);
           System.out.println("Partition of Method= " + partition);
           System.out.println("Mod of Method= " + mod);
        }

    public static int sumMake(int a, int b){
        return a+b;
    }

    public static int extractionMake(int a, int b){
        return a-b;
    }

    public static int impactMake(int a, int b){
        return a*b;
    }

    public static int partitionMake(int a, int b){
        return a/b;
    }

    public static int modMake(int a, int b){
        return a%b;
    }
}
