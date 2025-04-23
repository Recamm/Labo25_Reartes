package U1;

public class Persona {
    private String nombre, direccion;
    private int edad;

    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

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