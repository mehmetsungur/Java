package example;

// Bu classda number sınıfının alt sınıfları kullanılabilsin.
public class GenericUpperBound<T extends Number> {
    private T[] numberArray;

    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }

    private double getAvarage(){
        double sum = 0;
        for(T w : numberArray){
            sum += w.doubleValue();
        }

        return sum/this.numberArray.length;
    }

    public static void main(String[] args) {
        Integer[] integers = {1,2,3};
        Double[] doubles = {1.1,2.2,3.3};
        String[] strings = {"A","B","C"};

        GenericUpperBound<Integer> bound = new GenericUpperBound<>(integers);
        System.out.println(bound.getAvarage());

        GenericUpperBound<Double> bound1 = new GenericUpperBound<>(doubles);
        System.out.println(bound1.getAvarage());
    }
}
