package day18multidimensionalarray;
public class Arrays02 {
    public static void main(String[] args) {
        int [][] ages = {{1,2} , {3,4,5}};
        int small = ages[0][0];

        for(int [] w : ages){
            for (int k : w){
                small = Math.min(small,k);
            }
        }
        System.out.print(small);
    }
}
