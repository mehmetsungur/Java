package day13nested;

public class Loops02 {
    public static void main(String[] args) {
        for (int i=0;i<6;i++){
            for (int k=0;k<i;k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
