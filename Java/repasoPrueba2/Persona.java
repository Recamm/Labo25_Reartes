package Java.repasoPrueba2;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre, apellido;
    private double dni;
    private LocalDate fechaNacimiento, trabajandoDesde;

    public Persona(String nombre, String apellido, double dni, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellido, double dni, LocalDate fechaNacimiento, LocalDate trabajandoDesde){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.trabajandoDesde = trabajandoDesde;
    }

    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDni(double dni) { this.dni = dni; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public void setTrabajandoDesde(LocalDate trabajandoDesde) { this.trabajandoDesde = trabajandoDesde; }

    public String getNombre(){ return this.nombre; }
    public String getApellido() { return apellido; }
    public double getDni() { return dni; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public LocalDate getTrabajandoDesde() { return trabajandoDesde; }

    public int antiguedad(){
        Period periodo = Period.between(LocalDate.now(), this.trabajandoDesde);
        return periodo.getDays();
    }
}
