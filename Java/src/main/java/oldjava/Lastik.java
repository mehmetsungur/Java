package oldjava;

public interface Lastik extends DisDonanim {
    /* interface' i interface' e parent yaparken "extends" keyword' ü kullanılır.
        class => class : extends
        interface => interface : extends
        class => interface : implements

        interface => class : OLMAZ Bir interface' in parent' ı class olamaz.
     */
    public static final String MARKA = "Audi";
    void garanti();
    void jant();
}
