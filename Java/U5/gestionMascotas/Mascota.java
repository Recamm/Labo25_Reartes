package U5.gestionMascotas;

public abstract class Mascota {
    private String nombre, dueno;

    public Mascota(String nombre, String dueno) {
        this.nombre = nombre;
        this.dueno = dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public abstract String saludar();
}
