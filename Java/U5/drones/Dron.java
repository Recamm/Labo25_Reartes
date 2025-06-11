package U5.drones;

import java.time.LocalDate;

public abstract class Dron {
    private String nombreModelo;
    private LocalDate fechaAdquicicion;
    private int nivelCarga, contador;
    private Estado estado;

    public Dron(String nombreModelo, LocalDate fechaAdquicicion, int nivelCarga, int contador, Estado estado) {
        this.nombreModelo = nombreModelo;
        this.fechaAdquicicion = fechaAdquicicion;
        this.nivelCarga = nivelCarga;
        this.contador = contador;
        this.estado = estado;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public LocalDate getFechaAdquicicion() {
        return fechaAdquicicion;
    }

    public void setFechaAdquicicion(LocalDate fechaAdquicicion) {
        this.fechaAdquicicion = fechaAdquicicion;
    }

    public int getNivelCarga() {
        return nivelCarga;
    }

    public void setNivelCarga(int nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void recarga(){
        if (this.nivelCarga < 20){
            this.nivelCarga = 100;
        } else {
            if (this.nivelCarga <= 90){
                this.nivelCarga += 10;
            }
        }
    }


}
