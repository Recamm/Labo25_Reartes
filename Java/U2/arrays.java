package U2;

import U1.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class arrays {
    public static <Chara> void main(String[] args) {
        // AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
        ArrayList<Integer> numEnteros = new ArrayList<Integer>();
        numEnteros.add(1);
        numEnteros.add(2);
        numEnteros.add(4);
        numEnteros.add(9);
        numEnteros.add(5);
        numEnteros.add(7);
        numEnteros.add(3);
        numEnteros.add(5);
        int sum = 0;
        for(Integer n:numEnteros){
            sum += n;
        }
        System.out.println("La suma es: " + sum);


        //BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
        ArrayList<String> palabras = new ArrayList<String>();
        palabras.add("Hola");
        palabras.add("Computadora");
        palabras.add("Secundaria");
        palabras.add("Teclado");
        palabras.add("Helado");

        System.out.print("Letra inicial de la palabra --> ");
        Scanner text = new Scanner(System.in);
        char letra = text.nextLine().toLowerCase().charAt(0);

        System.out.println("Palabras que empiezan con " + letra + ":");
        for (String p:palabras){
//            if (p.charAt(0).toLowerCase() == letra){
            if (Character.toLowerCase(p.charAt(0)) == letra){
                System.out.println(p);
            }
        }


        //CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
        ArrayList<Persona> pers = new ArrayList<Persona>();

        Persona pers1 = new Persona("Camilo1", "Asdad 132", 40);
        Persona pers2 = new Persona("Camilo2", "Asdad 132", 25);
        Persona pers3 = new Persona("Camilo3", "Asdad 132", 65);
        pers.add(pers1);
        pers.add(pers2);
        pers.add(pers3);

        System.out.println("Persona con mas de 30 anios: ");
        for (Persona p:pers){
            if (p.getEdad() > 30){
                System.out.println("Nombre: " + p.getNombre());
            }
        }
    }
}
