package ejercicios_curso_java;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2, total;

        Customer c1 = new Customer();
        c1.setName("Pinky");
        System.out.println("El nombre" + c1.getName());

        Clothing item1 = new Clothing(), item2 = new Clothing();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        System.out.println("ITEM 1:");
        System.out.println("Description: " + item1.getDescription() + " Price: " + item1.getPrice() + " Size: " + item1.getSize());
        System.out.println("ITEM 2:");
        System.out.println("Description: " + item2.getDescription() + " Price: " + item2.getPrice() + " Size: " + item2.getSize());

        System.out.println("1xItem1 2xItem2");
        total = (item1.getPrice() + 2*item2.getPrice()) * (1 + tax);
        System.out.println("Total price: " + total);
    }
}