package repasoPrueba3.Tickets;

import repasoPrueba3.Default.Estado;
import repasoPrueba3.Gente.Cliente;
import repasoPrueba3.Gente.Desarrollador;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Ticket {
    private Cliente cliente;
    private String descripcion;
    private LocalDateTime dtCracion, dtFinalizacion;
    private ArrayList<String> anotaciones;
    private Estado estado;
    private ArrayList<Desarrollador> desarrolladores;

    public Ticket(Cliente cliente, String descripcion){
        this.dtCracion = LocalDateTime.now();
        this.anotaciones = new ArrayList<>();
        this.desarrolladores = new ArrayList<>();
        this.estado = Estado.ABIERTO;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getDtCracion() {
        return dtCracion;
    }

    public void setDtCracion(LocalDateTime dtCracion) {
        this.dtCracion = dtCracion;
    }

    public LocalDateTime getDtFinalizacion() {
        return dtFinalizacion;
    }

    public void setDtFinalizacion(LocalDateTime dtFinalizacion) {
        this.dtFinalizacion = dtFinalizacion;
    }

    public void agregarAnotacion(String anotacion){
        this.anotaciones.add(anotacion);
    }

    public Estado getEstado(){
        return this.estado;
    }

    public ArrayList<Desarrollador> getDesarrolladores(){
        return this.desarrolladores;
    }

    public void agregarDev(Desarrollador dev){
        this.desarrolladores.add(dev);
        dev.addTicketWorkingOn(this);
    }

    public void cambiarEstado(Estado estado){
        this.estado = estado;
        if (estado.isFinalizado()){
            this.dtFinalizacion = LocalDateTime.now();
        }
    }

    public abstract boolean resolver();
}
