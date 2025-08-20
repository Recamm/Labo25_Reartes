package U6.personas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public abstract class Disenadores {
    private String nombre, apellido;
    private HashMap<String, Integer> proyectosGanado;
    private int comision;

    public Disenadores(String nombre, String apellido, HashMap<String, Integer> proyectosGanado, int comision) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.proyectosGanado = proyectosGanado;
        this.comision = comision;
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

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public HashMap<String, Integer> getProyectosGanado() {
        return proyectosGanado;
    }

    public void setProyectosGanado(HashMap<String, Integer> proyectosGanado) {
        this.proyectosGanado = proyectosGanado;
    }

    public double verSueldo(){
        double sueldo = 0;
        for (Map.Entry<String, Integer> entry : this.proyectosGanado.entrySet()) {
            sueldo += entry.getValue();
        }
        sueldo *= this.comision/100;
        return sueldo;
    }

    public int verCantProyectos(){
        return this.proyectosGanado.size();
    }

    public int verGananciaProyecto(String nombreProyecto){
        for (Map.Entry<String, Integer> entry : this.proyectosGanado.entrySet()){
            if (entry.getKey() == nombreProyecto){
                return entry.getValue();
            }
        }
        return 0;
    }

    public void verInfoProyectos(){
        for (Map.Entry<String, Integer> entry : this.proyectosGanado.entrySet()){
            System.out.println("Nombre: " + entry.getKey());
            System.out.println("Ganado: " + entry.getValue());
            double comision = entry.getValue()*this.comision/100;
            System.out.println("Comision: " + comision);
            System.out.println("-----------------------------------");
        }
    }
}
