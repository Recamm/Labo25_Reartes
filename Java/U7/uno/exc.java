package U7.uno;

public class exc {
    public static void main(String[] args) {
        try {
            String nombre = null;
            System.out.println("El largo del nombre es:" + nombre.length());
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Nombre invalido!");
        }
    }
}