package repasoPrueba3;

public class Dispositivo {
    private String nombre;
    private boolean hayRepuestos;

    public Dispositivo(String nombre, boolean hayRepuestos) {
        this.nombre = nombre;
        this.hayRepuestos = hayRepuestos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHayRepuestos() {
        return hayRepuestos;
    }

    public void setHayRepuestos(boolean hayRepuestos) {
        this.hayRepuestos = hayRepuestos;
    }
}
