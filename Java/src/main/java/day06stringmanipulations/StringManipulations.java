package day06stringmanipulations;

public class StringManipulations {
    public static void main(String[] args) {
        String t = "Merhaba ";
        System.out.println(t.replaceAll("[a-zA-Z0-9]","!"));
        System.out.println(t.replaceAll("[aeıioöuüAEIİOÖUÜ]","!"));
        System.out.println(t.replaceAll("[^aeıioöuüAEIİOÖUÜ]","!"));
        System.out.println(t.replaceAll("[^a-z]","<>"));
        System.out.println(t.replaceAll("[^a-zA-Z]","+"));
        System.out.println(t.replaceAll("[^ ]","?"));
    }
}
