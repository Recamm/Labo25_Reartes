package U2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Alumno {
    private String nombre, apellido;
    private LocalDate fechaNacimiento;
    private ArrayList<Integer> listaNotas = new ArrayList<Integer>();
    Period diff = this.fechaNacimiento.until(LocalDate.now());
    int edadAnios = diff.getYears();

    public int getEdad() {
        return edadAnios;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void agregarNota (Integer notaAgregar) {
        this.listaNotas.add(notaAgregar);
    }

    public int mayorNota (){
        int mayor = this.listaNotas.get(0);
        for (Integer nota:this.listaNotas){
            if (nota > mayor){
                mayor = nota;
            }
        }
        return mayor;
    }

    public int menor (){
        int menor = this.listaNotas.get(0);
        for (Integer nota:this.listaNotas){
            if (nota < menor){
                menor = nota;
            }
        }
        return menor;
    }

    public int promedioNotas(){
        int suma = 0;
        for (int n:this.listaNotas){
            suma += n;
        }
        suma /= this.listaNotas.size();
        return suma;
    }
}
