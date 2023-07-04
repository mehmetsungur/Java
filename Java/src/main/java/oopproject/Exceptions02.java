package oopproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions02 {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("/Users/mehmetsungur/Desktop/Java/Java/Java/src/main/java/oopproject/TextfileTr");
        } catch (FileNotFoundException e) {

        }

    }
}
