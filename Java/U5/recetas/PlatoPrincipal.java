package U5.recetas;

import java.util.ArrayList;

public class PlatoPrincipal extends Receta {
    private int tiempoCoccion, numeroComersales; // Minutos de coccion

    public PlatoPrincipal(String nombre, Dificultad dificultad, ArrayList<String> pasos, int tiempoCoccion, int numeroComersales) {
        super(nombre, dificultad, pasos);
        this.tiempoCoccion = tiempoCoccion;
        this.numeroComersales = numeroComersales;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public int getNumeroComersales() {
        return numeroComersales;
    }

    public void setNumeroComersales(int numeroComersales) {
        this.numeroComersales = numeroComersales;
    }

    @Override
    public void instrucciones(){
        System.out.println("Esta receta tarda en cocinarse " + this.tiempoCoccion + " minutos y los pasos son:");
        for (String p:pasos){
            System.out.println(p);
        }
    }
}
