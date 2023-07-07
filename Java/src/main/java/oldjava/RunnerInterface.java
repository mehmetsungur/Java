package oldjava;

public class RunnerInterface {
    public static void main(String[] args) {
        Civic civic = new Civic();
        civic.ayna();
        civic.far();
        civic.direksiyon();
        civic.garanti();
        civic.koltuk();
        civic.benzin();
        civic.kaporta();
        civic.jant();
        civic.dizel();

        System.out.println(IcDonanim.FIYAT);
        System.out.println(DisDonanim.MARKA);
    }
}
