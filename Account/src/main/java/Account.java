import java.util.Scanner;
import java.text.DecimalFormat;

public class Account {
    private int musteriNo;
    private int pinNo;
    private double vadesiz;
    private double vadeli;

    Scanner scan = new Scanner(System.in);
    DecimalFormat paraFormat = new DecimalFormat("'$'#,###.00");

    public int getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(int musteriNo) {
        this.musteriNo = musteriNo;
    }

    public int getPinNo() {
        return pinNo;
    }

    public void setPinNo(int pinNo) {
        this.pinNo = pinNo;
    }

    public double getVadesiz() {
        return vadesiz;
    }

    public void setVadesiz(double vadesiz) {
        this.vadesiz = vadesiz;
    }

    public double getVadeli() {
        return vadeli;
    }

    public void setVadeli(double vadeli) {
        this.vadeli = vadeli;
    }

    public double paraCekVadesizden(double miktar){
        vadesiz = vadesiz - miktar;
        return vadesiz;
    }

    public double paraYatirVadesize(double miktar){
        vadesiz = vadesiz + miktar;
        return vadesiz;
    }

    public double paraCekVadeliden(double miktar){
        vadeli = vadeli - miktar;
        return vadeli;
    }

    public double paraYatirVadeliye(double miktar){
        vadeli = vadeli + miktar;
        return vadeli;
    }

    public void vadesizBakiyeParaCekildiktenSonra(){
        System.out.println("Vadesiz Hesap Bakiyeniz: " + paraFormat.format(vadesiz));
        System.out.print("Lütfen Çekmek İstediğiniz Miktarı Giriniz: ");
        double miktar = scan.nextDouble();

        if(vadesiz >= miktar){
            paraCekVadesizden(miktar);
            System.out.println("Çektiğiniz miktar: " + miktar);
            System.out.println("Vadesiz Hesap Bakiyeniz: " + paraFormat.format(vadesiz));
        }else {
            System.out.println("Yetersiz Bakiye ..");
        }
    }

    public void vadesizBakiyeParaYatirdiktanSonra(){
        System.out.println("Vadesiz Hesap Bakiyeniz: " + paraFormat.format(vadesiz));
        System.out.print("Lütfen Yatırmak İstediğiniz Miktarı Giriniz: ");
        double miktar = scan.nextDouble();

        if(miktar > 0){
            paraYatirVadesize(miktar);
            System.out.println("Vadesiz Hesap Bakiyeniz: " + paraFormat.format(vadesiz));
        }else {
            System.out.println("Lütfen Geçerli Miktar Giriniz ..");
        }
    }

    public void vadeliBakiyeParaCekildiktenSonra(){
        System.out.println("Vadeli Hesap Bakiyeniz: " + paraFormat.format(vadeli));
        System.out.print("Lütfen Çekmek İstediğiniz Miktarı Giriniz: ");
        double miktar = scan.nextDouble();

        if(vadeli >= miktar){
            paraCekVadeliden(miktar);
            System.out.println("Çektiğiniz miktar: " + miktar);
            System.out.println("Vadesiz Hesap Bakiyeniz: " + paraFormat.format(vadeli));
        }else {
            System.out.println("Yetersiz Bakiye ..");
        }
    }

    public void vadeliBakiyeParaYatirdiktanSonra(){
        System.out.println("Vadesiz Hesap Bakiyeniz: " + paraFormat.format(vadeli));
        System.out.print("Lütfen Yatırmak İstediğiniz Miktarı Giriniz: ");
        double miktar = scan.nextDouble();

        if(miktar > 0){
            paraYatirVadeliye(miktar);
            System.out.println("Vadesiz Hesap Bakiyeniz: " + paraFormat.format(vadeli));
        }else {
            System.out.println("Lütfen Geçerli Miktar Giriniz ..");
        }
    }
}