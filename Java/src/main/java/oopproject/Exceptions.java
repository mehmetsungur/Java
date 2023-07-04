package oopproject;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) throws IOException {
        //Dosyaya Ulaşmak
        FileInputStream fi = new FileInputStream("/Users/mehmetsungur/Desktop/Java/Java/Java/src/main/java/oopproject/TextfileTr");

        //Ulaşılan Dosya üzerinde işlem yapmak
        int k;
        while((k = fi.read()) != -1){
            System.out.print((char)k);
        }
    }
}
