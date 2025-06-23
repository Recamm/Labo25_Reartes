package U3.vehiculos;

public class Camioneta extends Vehiculo {
    private int patente;
    private int capacidadCargaKG;
    private int carga;

    public Camioneta(String marca, String modelo, Color color, int cantidadDeRuedas, int anioFabricacion, int patente, int capacidadCargaKG, int carga) {
        super(marca, modelo, color, cantidadDeRuedas, anioFabricacion);
        this.patente = patente;
        this.capacidadCargaKG = capacidadCargaKG;
        this.carga = carga;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public int getCapacidadCargaKG() {
        return capacidadCargaKG;
    }

    public void setCapacidadCargaKG(int capacidadCargaKG) {
        this.capacidadCargaKG = capacidadCargaKG;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        if (carga < this.capacidadCargaKG){
            this.carga = carga;
        }
    }
}
