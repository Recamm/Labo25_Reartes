package personas;

import java.util.HashMap;
import java.util.HashSet;

public abstract class Disenadores {
    private String nombre, apellido;
    private HashMap<String, Integer> proyectosGanado;

    public Disenadores(String nombre, String apellido, HashMap<String, Integer> proyectosGanado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.proyectosGanado = proyectosGanado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public HashMap<String, Integer> getProyectosGanado() {
        return proyectosGanado;
    }

    public void setProyectosGanado(HashMap<String, Integer> proyectosGanado) {
        this.proyectosGanado = proyectosGanado;
    }
}
