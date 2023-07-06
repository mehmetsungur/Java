package oldjava;

public class GarbageE04 {
    public static void main(String[] args) {
        try{
            hata();
        }catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void hata(){
        throw new IllegalArgumentException("Invalid Number");
    }
}
