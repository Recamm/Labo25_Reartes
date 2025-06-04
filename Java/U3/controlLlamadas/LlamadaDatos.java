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
        updateHistoryUsers();
        updateTimeUser();
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

    public void updateHistoryUsers(){
        this.origen.agregarLlamada(this);
        this.destino.agregarLlamada(this);
    }

    public void updateTimeUser(){
        if (origen.getPais() == destino.getPais()){
            this.origen.agregarTiempoNacional(this.duracionSegs);
            this.destino.agregarTiempoNacional(this.duracionSegs);
        } else {
            this.origen.agregarTiempoInternacional(this.duracionSegs);
            this.destino.agregarTiempoInternacional(this.duracionSegs);
        }
    }
}
