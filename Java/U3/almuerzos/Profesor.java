package U3.almuerzos;

public class Profesor extends Persona {
    private int porcentajeDescuento; // por ejemplo: 30, 20, 40, 55

    public Profesor(String nombre, String apellido, int porcentajeDescuento) {
        super(nombre, apellido);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
