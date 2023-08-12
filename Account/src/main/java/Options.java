import java.util.Map;
import java.util.Set;
import java.util.Scanner;
import java.util.HashMap;
import java.text.DecimalFormat;

public class Options extends Account {
    Scanner scan = new Scanner(System.in);
    DecimalFormat paraFormat = new DecimalFormat("'$'#,###.00");
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
            int count=0;
            for(Map.Entry<Integer,Integer> w : musteriDataSet){
                if(w.getKey() == getMusteriNo() && w.getValue() == getPinNo()){
                    islemSec();
                    flag = false;
                }else{
                    count++;
                }
            }
            if(count==musteriDataSet.size()){
                System.out.println("Müşteri veya PIN numarası Hatalı");
                System.out.println("Tekrar denemek için herhangi bir sayıya basınız");
                System.out.print("Çıkmak için q tuşuna basınız: ");
                String cikis = scan.next().toLowerCase();
                if (cikis.equals("q")){
                    flag = false;
                }
            }
        }while (flag);
    }

    public void islemSec(){
        System.out.println("Hangi İşlemi");
        System.out.println("1: Vadesiz Hesap İşlemleri");
        System.out.println("2: Vadeli Hesap İşlemleri");
        System.out.println("3: Cikis");

        int secim = scan.nextInt();

        switch (secim){
            case 1:
                vadesizIslemler();
                break;
            case 2:
                vadeliIslemler();
                break;
            case 3:
                System.out.println("Teşekkürler, Tekrar Bekleriz..");
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız ..");
                islemSec();
        }
    }

    public void vadesizIslemler(){
        do {
            System.out.println("Yapmak istediğiniz işlemi seçiniz");
            System.out.println("1. Hesap makinesi inceleme");
            System.out.println("2. Para Çekme");
            System.out.println("3. Para Yatırma");
            System.out.println("3. Çıkış");

            int secim = scan.nextInt();
            if (secim == 4) {
                break;
            }
            switch (secim){
                case 1:
                    System.out.println("Vadesiz Hesap Bakiyeniz: " + paraFormat.format(getVadesiz()));
                    break;
                case 2:
                    vadesizBakiyeParaCekildiktenSonra();
                    break;
                case 3:
                    vadesizBakiyeParaYatirdiktanSonra();
                    break;
                default:
                    System.out.println("Yanlış Giriş yaptınız.");
            }
        }while (true);
        islemSec();
    }

    public void vadeliIslemler(){
        do {
            System.out.println("Yapmak istediğiniz işlemi seçiniz");
            System.out.println("1. Hesap makinesi inceleme");
            System.out.println("2. Para Çekme");
            System.out.println("3. Para Yatırma");
            System.out.println("3. Çıkış");

            int secim = scan.nextInt();
            if (secim == 4) {
                break;
            }
            switch (secim){
                case 1:
                    System.out.println("Vadeli Hesap Bakiyeniz: " + paraFormat.format(getVadeli()));
                    break;
                case 2:
                    vadeliBakiyeParaCekildiktenSonra();
                    break;
                case 3:
                    vadeliBakiyeParaYatirdiktanSonra();
                    break;
                default:
                    System.out.println("Yanlış Giriş yaptınız.");
            }
        }while (true);
        islemSec();
    }
}