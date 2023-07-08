package day36lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lambda02 {
    public static void main(String[] args) throws IOException {
        //Example 1: Verilen text file icindeki text i console a yazdiran code u yaziniz.
        Files
                .lines(Paths.get("Java/src/main/java/day36lambda/LambdaTextFile.txt"))
                .forEach(System.out :: println);

        System.out.println("-----------------");

        //Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.
        Files
                .lines(Paths.get("Java/src/main/java/day36lambda/LambdaTextFile.txt"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Example 3: Verilen text file icindeki text'lerde "get" kelimesinin olup olmadigini kontrol eden kodu yaziniz.
        boolean result = Files
                .lines(Paths.get("Java/src/main/java/day36lambda/LambdaTextFile.txt"))
                .anyMatch(t->t.contains("get"));
        System.out.println(result);
    }
}
