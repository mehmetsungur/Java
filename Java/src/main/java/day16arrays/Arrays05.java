package day16arrays;

public class Arrays05 {
    public static void main(String[] args) {
        int [] notes = new int[6];

        notes[0] = 12;
        notes[1] = 45;
        notes[2] = 67;
        notes[3] = 87;
        notes[4] = 98;
        notes[5] = 45;

        int sum = 0;

        for (int w : notes)
            sum += w;

        System.out.println(sum / notes.length);
    }
}
