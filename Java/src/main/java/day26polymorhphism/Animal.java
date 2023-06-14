package day26polymorhphism;

public class Animal {
    /*
    1) Parent Class daki methodu child class icinde ozellestirerek kullanmaya Overriding denir.
    2) Overriding de methodun parantezine, method ismine dokunulmaz,(==>method signature) degistirilmez,
        methodun body  si degistirilir
    3) private methodlar override edilemezler
    4) Child Classdaki methodun access modifieri parent Classdaki override edilmis method(Overriden Method) un
    access modifierindan dar olamaz. Aynisi olabilir yada daha genis olabilir
    5) Child class da override edilen methodun return type i ile parent taki methodun return type i arasinda IS-A iliskisi
    varsa return type degisitirilebilir
    6) Methodun return type i primitive ise overriding yaraken return type degistirilimez. Cunku return type ya ayni olur veya
    parent tan secilir, ama primitive ler arasinda parent child iliskisi olmadiginidan parent tan secmek sozkonusu olamaz
     */
    public void eat(){
        System.out.println("Animals eat");
    }
    public void drink(){
        System.out.println("Animals drink");
    }

    public Animal create(){
        return new Animal();
    }

    public int Add(int a,int b){
        return a+b;
    }
}