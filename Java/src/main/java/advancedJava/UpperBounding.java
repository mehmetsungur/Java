package advancedJava;
//parametre olarak aldığımız data tipini üstten sınırlandırabiliriz.
//bu sınıfta sadece Number classının alt sınırları kullanılabiliyor
//integer, Double, Log,Flag
public class UpperBounding<T extends Number>{
    private T[] numberArray;
    //param const

    public UpperBounding(T[] numberArray){
        this.numberArray = numberArray;
    }

    //numberArray içindeki elemanların ortalmasını bul
    private double getAvarage(){
        double sum = 0;
        for(T w:numberArray){
            sum += w.doubleValue();
        }

        double avarage =  sum/this.numberArray.length;
        return avarage;
    }

    public static void main(String[] args) {
        Integer[] integers = {1,2,3};
        Double[] doubles = {1.1,2.2,3.3};
        String[] strings = {"A","B","C"};

        UpperBounding<Integer> obj1 = new UpperBounding<>(integers);
        System.out.println(obj1.getAvarage());

        UpperBounding<Double> obj2 = new UpperBounding<>(doubles);
        System.out.println(obj2.getAvarage());

        //UpperBounding<String> obj3 = new UpperBounding<>(strings);
        // Generic Data type Numbers olarak üstten sınırlandırıldı.
        // String i kabul etmez.
    }
}
