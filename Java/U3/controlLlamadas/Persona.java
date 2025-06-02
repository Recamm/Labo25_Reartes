package U3.controlLlamadas;

public class Persona {
    private String nombre, apellido, pais;
    private int numeroTelefo, numeroDNI;

    public Persona(String nombre, String apellido, String pais, int numeroTelefo, int numeroDNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.numeroTelefo = numeroTelefo;
        this.numeroDNI = numeroDNI;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumeroTelefo() {
        return numeroTelefo;
    }

    public void setNumeroTelefo(int numeroTelefo) {
        this.numeroTelefo = numeroTelefo;
    }

    public int getNumeroDNI() {
        return numeroDNI;
    }

    public void setNumeroDNI(int numeroDNI) {
        this.numeroDNI = numeroDNI;
    }
}
