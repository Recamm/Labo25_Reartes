package U5.drones;

import java.time.LocalDate;

public class DronCarga extends Dron{
    private double pesoCarga;

    public DronCarga(String nombreModelo, LocalDate fechaAdquicicion, int nivelCarga, Estado estado, double pesoCarga) {
        super(nombreModelo, fechaAdquicicion, nivelCarga, estado);
        this.pesoCarga = pesoCarga;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public void descargarBateria(int descarga){
        setNivelCarga(getNivelCarga() - descarga);
    }
}
