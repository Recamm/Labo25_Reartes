package U7.bibliotecaVirtual;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private int dni;
    private Membresia membresia;

    public Usuario(String nombre, LocalDate fechaDeNacimiento, int dni, Membresia membresia) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
        this.membresia = membresia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}
