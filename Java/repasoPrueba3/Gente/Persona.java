package repasoPrueba3.Gente;

public abstract class Persona {
    private int nombre, apellido;

    public Persona(int nombre, int apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getApellido() {
        return apellido;
    }

    public void setApellido(int apellido) {
        this.apellido = apellido;
    }
}
