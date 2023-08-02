package oldjava;

public class Concat {
    public static void main(String[] args) {
        add();
        add(1,2);
        add(1,2,3);
        add(1,2,3,4);
        concat("A");
        concat("A","B");
        concat("A","B","C");
        printer("Name");
        printer("","M", "example","H","M", "example","T");
    }
    /*
    public static void add(int a,int b){
        System.out.println(a+b);
    }

    public static void add(int a,int b, int c){
        System.out.println(a+b+c);
    }
    */
    public static void add(int... a){
        int sum = 0;
        for(int w:a){
            sum += w;
        }
        System.out.println(sum);
    }

    public static void concat(String... a){
        String str="";
        for(String w : a){
            str += w;
        }
        System.out.println(str);
    }

    public static void printer(String a, String... s){
        System.out.println(a);
        for(String w : s){
            System.out.print(w + " ");
        }
    }
}
