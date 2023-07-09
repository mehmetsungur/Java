package oldjava;

public interface Iterators {
    /*
    Method oluştururken "default" ve "static keywordlerini kullanrak isterseniz interface içinde
    "concrete method" oluşturabilirsiniz.
     */
    /*
    Interface içinde concrete method oluşturmak için kullanılan "default" keywordu access modifier değildir.
    Aşağıdaki methodda gorduğunuz gibi access modifier public' dir.
     */
    /*
    Aşağıdaki gordunuz gibi interface concrete method olusturmanin iki yolu var.
    1) "default" keyword kullanarak => Baska class' lardan bu methoda ulasmak icin object olusturmalisiniz.
    2) static keyword kullanarak => Baska class' lardan bu methoda ulasmak için object olusturmaniza gerek yok sadece
                                    interface ismi ile methoda ulasabilirsiniz.
    */
    default int add(){
        return 0;
    };

    public static int multiply(){
        return 0;
    }
}
