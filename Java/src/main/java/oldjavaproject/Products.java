package oldjavaproject;

public class Products {
     private double snicker = 2.5;
     private double chipsAhoy = 2.2;
     private double pringles = 12.99;
     private double milano = 14.3;
     private double cocaCola = 2.2;
     private double fanta = 2.0;
     private double water = 1.0;
     private double arizona = 1.5;
     private double skittles = 1.99;

     private int productNum;
     private double price;

    @Override
    public String toString() {
        return "Products \n1.Snicker = $" + snicker +
                "\n2.ChipsAhoy = $" + chipsAhoy +
                "\n3.Pringles = $" + pringles +
                "\n4.Milano = $" + milano +
                "\n5.CocaCola = $" + cocaCola +
                "\n6.Fanta = $" + fanta +
                "\n7.Water = $" + water +
                "\n8.Arizona = $" + arizona +
                "\n9.Skittles = $" + skittles;
    }

    public double getSnicker() {
        return snicker;
    }

    public double getChipsAhoy() {
        return chipsAhoy;
    }

    public double getPringles() {
        return pringles;
    }

    public double getMilano() {
        return milano;
    }

    public double getCocaCola() {
        return cocaCola;
    }

    public double getFanta() {
        return fanta;
    }

    public double getWater() {
        return water;
    }

    public double getArizona() {
        return arizona;
    }

    public double getSkittles() {
        return skittles;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}