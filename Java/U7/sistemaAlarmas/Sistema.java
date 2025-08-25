package U7.sistemaAlarmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    static ArrayList<Sensor> sensores = new ArrayList<>();

    public void statusSensores(){
        for (Sensor s: sensores){
            s.statusAlarma();
        }
    }

    public static void main(String[] args) {
        boolean bucle = true;
        Scanner scanner = new Scanner(System.in);
        while (bucle){
            System.out.println("Seleccionar una alarma:");
            System.out.print("(0-" + sensores.size() + ") --> ");
            int nro = Integer.parseInt(scanner.nextLine());
            try {
                System.out.println(sensores.get(nro).getMedida());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: " + e);
                System.out.println("Numero ingresado no valido!");
            }
        }
        scanner.close();
    }
}
