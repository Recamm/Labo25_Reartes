package U5.recetas;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.PropertyResourceBundle;

public class Sistema {
    ArrayList<Receta> recetas = new ArrayList<>();

    private void agregarReceta(Receta receta){
        recetas.add(receta);
    }

    private void eliminarReceta(Receta receta){
        recetas.remove(receta);
    }

    private void modificarReceta(Receta ant, Receta post){
        int index = 0;
        for (int i = 0; i < recetas.size(); i++){
            if (recetas.get(i).equals(ant)){
                index = i;
            }
        }
        recetas.set(index, post);
    }

    private void recetasDificultad(Dificultad dificultad){
        System.out.println("Recetas " + dificultad.name().toString() + ":");
        for (Receta r:recetas){
            System.out.println(r.getNombre());
        }
    }

    private void filtrarTipoReceta(String nombreClase){
        for (Receta r:recetas){
            if (r.getClass().getName() == nombreClase){
                System.out.println(r.getNombre());
            }
        }
    }

    private Receta recetaMasLarga(){
        Receta receta = recetas.get(0);
        for (Receta r:recetas){
            if (r.getPasos().size() > receta.getPasos().size()){
                receta = r;
            }
        }
        return receta;
    }

}
