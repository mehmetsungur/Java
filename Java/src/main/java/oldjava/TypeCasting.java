package oldjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";

        List<String> list = new ArrayList<>();
        do{
            System.out.print("str: ");
            str = scan.next();
            if(!str.equals("0")){
                list.add(str);
            }
        }while (!str.equals("0"));

        System.out.println(list);

        int multiply = 1;
        for (int i=0;i<list.size();i++){
            multiply *= Integer.parseInt(list.get(i));
        }

        System.out.println(multiply);
    }
}
