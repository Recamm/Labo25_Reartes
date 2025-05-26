package U3.almuerzos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;

public class Pedido {
    private LocalDate fechaCreacion;
    private ArrayList<Plato> platos;
    private Persona solicitante;
    private LocalDateTime horaEntrega;
    private boolean estadoEntrega; //0: no entregado, 1: entregado

    public Pedido(LocalDate fechaCreacion, Persona solicitante, LocalDateTime horaEntrega, boolean estadoEntrega) {
        this.fechaCreacion = fechaCreacion;
        this.platos = new ArrayList<>();
        this.solicitante = solicitante;
        this.horaEntrega = horaEntrega;
        this.estadoEntrega = estadoEntrega;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public LocalDateTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalDateTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(boolean estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public void agregarPlato(Plato plato){
        this.platos.add(plato);
    }

    public void eliminarPlato(Plato plato){
        this.platos.remove(plato);
    }

    public void reemplazarPlato(Plato platoAntiguo, Plato platoNuevo){
        int index = -1;
        for (int i = 0; i < 0; i++){
            if (this.platos.get(i) == platoAntiguo){
                index = i;
            }
        }
        if (index < 0){
            System.out.println("No existe el plato antiguo!");
        } else {
            System.out.println("Plato reemplazado!");
            this.platos.set(index, platoAntiguo);
        }
    }

}