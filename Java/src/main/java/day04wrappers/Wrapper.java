package day04wrappers;

public class Wrapper {
    public static void main(String[] args) {
        int n = 12;
        Integer m = 12;

        byte p = 121;
        Byte r = 12;

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;

        int i = 12;

        Integer ir = i;

        System.out.println("Values: " + maxShort + " and " + minShort + " and " + ir);
    }
}
