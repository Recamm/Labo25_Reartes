package U6.personas;

import U6.Comidas.Plato;
import U6.Comidas.Plato;

import java.util.HashSet;
import java.util.Map;

public class Persona {
    private String nombre, apellido;
    private int dni;
    private HashSet<Plato> platosConsumidos;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.platosConsumidos = new HashSet<>();
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public HashSet<Plato> getPlatosConsumidos() {
        return platosConsumidos;
    }

    public void setPlatosConsumidos(HashSet<Plato> platosConsumidos) {
        this.platosConsumidos = platosConsumidos;
    }

    public void agregarPlato(Plato plato){
        this.platosConsumidos.add(plato);
    }

    public void eliminarPlato(Plato plato){
        this.platosConsumidos.remove(plato);
    }

    public void modificarPlato(Plato plato1, Plato plato2){
        this.platosConsumidos.remove(plato1);
        this.platosConsumidos.add(plato2);
    }

    public int cantCaloriasTotales(){
        int calorias = 0;
        for (Plato p:this.platosConsumidos){
            calorias += p.getCalorias();
        }
        return calorias;
    }
}