package U3.controlLlamadas;

import java.util.ArrayList;

public class Empleado {
    private String nombre, apellido, pais;
    private int numeroTelefo, numeroDNI, tiempoLlamadaNacional, tiempoLlamadaInternacional;
    private ArrayList<LlamadaDatos> llamadas;

    public Empleado(String nombre, String apellido, String pais, int numeroTelefo, int numeroDNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.numeroTelefo = numeroTelefo;
        this.numeroDNI = numeroDNI;
        llamadas = new ArrayList<>();
        this.tiempoLlamadaNacional = 0;
        this.tiempoLlamadaInternacional = 0;
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

    public ArrayList<LlamadaDatos> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<LlamadaDatos> llamadas) {
        this.llamadas = llamadas;
    }

    public int getTiempoLlamadaNacional() {
        return tiempoLlamadaNacional;
    }

    public void setTiempoLlamadaNacional(int tiempoLlamadaNacional) {
        this.tiempoLlamadaNacional = tiempoLlamadaNacional;
    }

    public int getTiempoLlamadaInternacional() {
        return tiempoLlamadaInternacional;
    }

    public void setTiempoLlamadaInternacional(int tiempoLlamadaInternacional) {
        this.tiempoLlamadaInternacional = tiempoLlamadaInternacional;
    }

    public void agregarLlamada(LlamadaDatos lld){
        llamadas.add(lld);
    }

    public void eliminarLlamada(LlamadaDatos lld){
        llamadas.remove(lld);
    }

    public void agregarTiempoNacional(int tiempo){
        this.tiempoLlamadaNacional += tiempo;
    }

    public void agregarTiempoInternacional(int tiempo){
        this.tiempoLlamadaInternacional += tiempo;
    }
}
