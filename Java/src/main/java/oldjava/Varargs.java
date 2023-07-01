package oldjava;

public class Varargs {
    public static void main(String[] args) {
        int arr[][] = {{2,3},{4},{5,6,7}};
        int multiply = 1;

        //For
        for (int i=0;i<arr.length;i++){
            for (int k=0;k<i;k++){
                multiply*=arr[i][k];
            }
        }
        System.out.println(multiply);

        //Foreach
        for (int [] w : arr){
            for(int t : w){
                multiply*=t;
            }
        }
        System.out.println(multiply);
    }
}
