package U7.bibliotecaVirtual;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor {
    private String nombre, apellido;
    private LocalDate fechaDeNacimiento;
    private int dni;
    private HashSet<Libro> bibliografia;

    public Autor(String nombre, String apellido, LocalDate fechaDeNacimiento, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
        this.bibliografia = new HashSet<>();
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

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public HashSet<Libro> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<Libro> bibliografia) {
        this.bibliografia = bibliografia;
    }

    public void agregarLibro(Libro libro){
        bibliografia.add(libro);
    }

    public void eliminarLibro(Libro libro){
        bibliografia.remove(libro);
    }
}
