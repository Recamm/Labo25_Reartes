package U5.recetas;

import java.util.ArrayList;

public class Postre extends Receta {
    private int tempHorno;
    private boolean aptoDiabeticos;

    public Postre(String nombre, Dificultad dificultad, ArrayList<String> pasos, int tempHorno, boolean aptoDiabeticos) {
        super(nombre, dificultad, pasos);
        this.tempHorno = tempHorno;
        this.aptoDiabeticos = aptoDiabeticos;
    }

    public int getTempHorno() {
        return tempHorno;
    }

    public void setTempHorno(int tempHorno) {
        this.tempHorno = tempHorno;
    }

    public boolean isAptoDiabeticos() {
        return aptoDiabeticos;
    }

    public void setAptoDiabeticos(boolean aptoDiabeticos) {
        this.aptoDiabeticos = aptoDiabeticos;
    }

    @Override
    public void instrucciones(){
        for (String p:pasos){
            System.out.print(p);
            System.out.println(" RECORDATORIO: Limpiar cocina y Horno al minimo!");
        }
    }

}