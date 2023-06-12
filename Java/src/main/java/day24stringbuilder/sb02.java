package day24stringbuilder;

public class sb02 {
    public static void main(String[] args) {
        // StringBuffer, StringBuilder ikiside "mutable" dır
        // StringBuffer multi-thread dir ancak StringBuilder değildir.

        // immutable string için; String Class
        // mutable string için; StringBuilder ve StringBuffer
        // StringBuilder; multi-thread gerekmezse kullanılır.
        // StringBuffer; multi-thread gerekirse kullanılır.
        // Multi-thread aynı zamanda birden fazla işi yapmak için kullanılır.
        // Multi-thread e iş sıralaması önemlidir. (syncronizecation)

        StringBuffer sbf = new StringBuffer("Java is easy");
        System.out.println(sbf.capacity());
    }
}
