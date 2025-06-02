package U3.controlLlamadas;

import java.time.LocalDate;

public class LlamadaDatos {
    private Empleado origen, destino;
    private LocalDate fecha;
    private int duracionSegs;

    public LlamadaDatos(Empleado origen, Empleado destino, LocalDate fecha, int duracionSegs) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.duracionSegs = duracionSegs;
    }

    public Empleado getOrigen() {
        return origen;
    }

    public void setOrigen(Empleado origen) {
        this.origen = origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public void setEntrada(Empleado destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDuracionSegs() {
        return duracionSegs;
    }

    public void setDuracionSegs(int duracionSegs) {
        this.duracionSegs = duracionSegs;
    }
}
