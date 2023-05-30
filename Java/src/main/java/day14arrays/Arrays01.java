package day14arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] stdNames = new String[5];

        for (int i=0;i<stdNames.length;i++){
            System.out.print((i+1) +" .student: ");
            String std = input.nextLine();
            if (std.equals("q"))
                break;
            else
                stdNames[i] = std;
        }

        System.out.println(Arrays.toString(stdNames));
    }
}
