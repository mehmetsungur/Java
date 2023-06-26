package day33enum;

public class EnumRunner {
    public static void main(String[] args) {
        //Enum daki herhangi bir sabit değere ulaşma
        Cities hatay = Cities.HATAY;
        System.out.println(hatay);

        String ankaraCityName = Cities.ANKARA.getCityName();
        System.out.println(ankaraCityName);

        String izmirPostalCode = Cities.İZMİR.getPostalCode();
        System.out.println(izmirPostalCode);

        int istanbulPlateCode = Cities.İSTANBUL.getPlateCode();
        System.out.println(istanbulPlateCode);
    }
}
