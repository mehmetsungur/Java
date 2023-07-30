import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Options extends Account {
    Scanner scan = new Scanner(System.in);
    DecimalFormat paraFormat = new DecimalFormat("'$'###,##.00");
    HashMap<Integer, Integer> musteriData = new HashMap<Integer,Integer>();

    public void login(){
        boolean flag = true;

        do{
            try{
                musteriData.put(12345, 123);
                musteriData.put(53434, 564);
                musteriData.put(12368, 131);
                musteriData.put(59877, 567);
                musteriData.put(80243, 895);

                System.out.print("Lütfen Müşteri Numaranızı Giriniz: ");
                setMusteriNo(scan.nextInt());

                System.out.println();

                System.out.print("Lütfen Pin Numaranızı Giriniz: ");
                setPinNo(scan.nextInt());
            }catch (Exception e){
                System.out.println("Lütfen Geçerli ve Pin Numarası Giriniz, Çıkmak için 'q' tuşuna basınız");
                String cikis = scan.next();

                if (cikis.equalsIgnoreCase("q")){
                    flag = false;
                }
            }
            Set<Map.Entry<Integer, Integer>> musteriDataSet = musteriData.entrySet();
            for(Map.Entry<Integer,Integer> w : musteriDataSet){
                if(w.getKey() == getMusteriNo() && w.getValue() == getPinNo()){
                    islemSec();
                }
            }
        }while (flag);
    }

    public void islemSec(){
        System.out.println("Hangi İşlemi");
        System.out.print("1: Vadesiz Hesap İşlemleri");
        System.out.print("2: Vadeli Hesap İşlemleri");
        System.out.print("3: Cikis");

        int secim = scan.nextInt();

        switch (secim){
            case 1:
                //vadesiz işlemler
                break;
            case 2:
                //vadeli işlemler
                break;
            case 3:
                System.out.println("Teşekkürler, Tekrar Bekleriz..");
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız ..");
                islemSec();
        }
    }
}
