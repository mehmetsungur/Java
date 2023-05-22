package day12lopps;

public class Loop01 {
    public static void main(String[] args) {
        String str = "ankara";
        String newStr ="";
        for (int i=0;i<str.length();i++){
            newStr+=str.charAt(i);
            i++;
        }
        System.out.println(newStr.toUpperCase());
    }
}
