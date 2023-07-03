package oldjava;

public class Ens01 {
    private int num = 12;
    private String name = "Emine";
    private char initial = 'J';
    private boolean old = true;

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOld(boolean old) {
        this.old = old;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    //Data type boolean oldugunda getter() method' un ismi "get" ile degil "is" ile baslar
    public boolean isOld() {
        return old;
    }
}
