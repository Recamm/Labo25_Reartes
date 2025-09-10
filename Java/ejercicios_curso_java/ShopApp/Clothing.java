package ejercicios_curso_java.ShopApp;

public class Clothing implements Comparable<Clothing>{
    private String description, size;
    private double price;

    //final --> Es una constante, no se puede modificar despues de su declaracion
    public final static double minPrice = 10, minTax = 0.2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() { return this.price * (1 + this.minTax); }

    public void setPrice(double price) {
        if (price > minPrice) {
            this.price = price;
        } else {
            this.price = minPrice;
        }
    }

    @Override 
    public String toString() {
        return getDescription() + ", " + getSize() + ", " + getPrice();
    }

    @Override
    public  int compareTo(Clothing c) { 
        return this.description.compareTo(c.description);
    }
}