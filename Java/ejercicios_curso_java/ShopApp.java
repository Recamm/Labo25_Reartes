package ejercicios_curso_java;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2, total = 0;

        Customer c1 = new Customer("Pinky", 3);
        //c1.setName("Pinky");
        //c1.setSize("S");

        System.out.println("El nombre" + c1.getName());

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M"), item2 = new Clothing("Orange T-Shirt", 10.5, "S"),
                item3 = new Clothing("Green Scarf", 5, "S"), item4 = new Clothing("Blue Jacket", 10.5, "M");

        Clothing[] items = {item1, item2, item3, item4};

//        item1.setDescription("Blue Jacket");
//        item1.setPrice(20.9);
//        item1.setSize("M");
//
//        item2.setDescription("Orange T-Shirt");
//        item2.setPrice(10.5);
//        item2.setSize("S");
//
//        item3.setDescription("Green Scarf");
//        item3.setPrice(5);
//        item3.setSize("S");
//
//        item4.setDescription("Blue Jacket");
//        item4.setPrice(10.5);
//        item4.setSize("S");

//        c1.setSize(3);
//        System.out.println("ITEM 1:");
//        System.out.println("Description: " + item1.getDescription() + " Price: " + item1.getPrice() + " Size: " + item1.getSize());
//        System.out.println("ITEM 2:");
//        System.out.println("Description: " + item2.getDescription() + " Price: " + item2.getPrice() + " Size: " + item2.getSize());

//        System.out.println("1xItem1 2xItem2");
//        total = (item1.getPrice() + 2*item2.getPrice()) * (1 + tax);
//        System.out.println("Total price: " + total);

        for(Clothing item : items) {
            if(item.getSize().equals(item.getSize())) {
                total += item.getPrice();
                System.out.println("Description: " + item.getDescription() + ", Price: " + item.getPrice() + ", Size: " + item.getSize());
                if (total > 15){ break; }
            }
        }
        System.out.println("Total price: " + total);

    }
}