package repasoPrueba4.ONG;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Personal {
    private String nombre, apellido, direccion;
    private LocalDate fechaNacimiento;
    private int codigoPostal;
    private boolean mensualidad;

    public static void main(String[] args) {
        HashMap<Integer, String> asd = new HashMap<>();
        asd.put(1, "asd");
        asd.put(2, "asdasd");
        asd.put(3, "asdasdasd");

        for (Integer i:asd.keySet()){
            System.out.println(i);
        }

        for (String i:asd.values()){
            System.out.println(i);
        }

        for (Map.Entry<Integer, String> i:asd.entrySet()){
            System.out.println(i);
        }

        System.out.println(asd.get(1));
        System.out.println(asd.ge);
    }
}
