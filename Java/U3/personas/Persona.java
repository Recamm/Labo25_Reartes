package Java.U3.personas;

import java.time.LocalDate;

public class Persona {
    private String nombre, apellido, direccion;
    private LocalDate fechaNacimiento;
    private int edad;

    public Persona(String nombre, String apellido, String direccion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void verPersona(){
        System.out.println("Nombre --> " + this.nombre);
        System.out.println("Edad --> " + this.edad);
        System.out.println("Direccion --> " + this.direccion);
    }
}