package oldjava;

public class Encapsulations {
    // Tüm variablelar private ve sadece getter() methodları oluşturulursa bu tarz classlara immutable class denir.

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
