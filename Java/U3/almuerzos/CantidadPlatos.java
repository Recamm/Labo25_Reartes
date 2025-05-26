package U3.almuerzos;

public class CantidadPlatos {
    private Plato plato;
    private int cantidad;

    public CantidadPlatos(int cantidad) {
        this.cantidad = 0;
    }

    public CantidadPlatos(Plato plato, int cantidad) {
        this.plato = plato;
        this.cantidad = cantidad;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void incrementarCantidad(){
        this.cantidad++;
    }
}
