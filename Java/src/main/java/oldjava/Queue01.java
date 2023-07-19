package oldjava;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    /*
        1) Elementler en sona eklenir ve en baştan silinir.
           Bu sisteme FIFO denir.
    */
    public static void main(String[] args) {
        //PriorityQueue kullanarak Queue üretirseniz, Java kendisi bir "priority" kuralı üretir.
        //İstenirse kendi Priority kuralı yapılabilir.
        Queue<String> q1 = new PriorityQueue<>();
        q1.add("A");
        q1.add("B");
        q1.add("C");
        q1.add("D");
        System.out.println(q1);

        //peek() methodu ilk elemanı silmeden verir.
        System.out.println(q1.peek());

        //peek() methodu ilk elemanı silerek verir.
        System.out.println(q1.poll());
    }
}
