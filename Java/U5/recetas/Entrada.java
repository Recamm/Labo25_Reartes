package U5.recetas;

import java.util.ArrayList;

public class Entrada extends Receta {
    private Temperatura temp;

    public Entrada(String nombre, Dificultad dificultad, ArrayList<String> pasos, Temperatura temp) {
        super(nombre, dificultad, pasos);
        this.temp = temp;
    }

    public Temperatura getTemp() {
        return temp;
    }

    public void setTemp(Temperatura temp) {
        this.temp = temp;
    }


    @Override
    public void instrucciones(){
        if (temp.equals(Temperatura.CALIENTE)){
            System.out.println("Prende el horno!");
        }
        for (String p:pasos){
            System.out.println(p);
        }
        if (temp.equals(Temperatura.FRIO)){
            System.out.println("Gurdar en la heladera!");
        }
    }
}
