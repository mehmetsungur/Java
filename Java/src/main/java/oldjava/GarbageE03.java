package oldjava;

public class GarbageE03 {
    // Console da detaylı bir hata mesajı yazmak için
    //printStackTrace komutu kullanılır.
    public static void main(String[] args) {
        int arr[] = {1,21,34,11};
        try{
            System.out.println(arr[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
