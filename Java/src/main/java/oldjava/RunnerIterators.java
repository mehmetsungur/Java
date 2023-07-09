package oldjava;

public class RunnerIterators implements Iterators {
    public static void main(String[] args) {
        System.out.println(Iterators.multiply());
        //add() methodu "default" keyword kullanrak oluşturulduğunda
        //ulasmak icin mecburen object uretmelisiniz.
        //ulasmak mumkun degildir.
        Iterators obj = new RunnerIterators();
        System.out.println(obj.add());

        /*
        Concrete bir class bir interface' in child class
        oldugunda interface' deki tum abstract methodlari override
        etmek zorundadir. Fakat bu zorunluluk "default"
        ve "static" keyword' ler kullanrak olusturulan concrete method'lar
        icin oktur.

        Burada gordugunuz gibi, add() ve multiply() method'larini
        override etmedik cunku oyle bir zorunluluk yok ama istersek override edebiliriz.
         */
    }
}
