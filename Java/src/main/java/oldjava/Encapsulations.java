package oldjava;

public class Encapsulations {
    // Tüm variable lar private ve sadece getter() methodları oluşturulursa bu tarz classlara immutable class denir.
    /* Bir class' da tüm variable' lar "private" ise ve tüm getter() ve setter() oluşturulmuş ise bu class
       "Fully Encapsulated" olarak adlandırılır.
       getter() ve setter() methodlarına java beans' de denir.
     */
    private int age = 25;
    private String name = "MS";

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
}
