package U5.drones;

import java.time.LocalDate;

public class DronVigilancia extends Dron{
    private double memoriaSDlibre;

    public DronVigilancia(String nombreModelo, LocalDate fechaAdquicicion, int nivelCarga, int contador, Estado estado, double memoriaSDlibre) {
        super(nombreModelo, fechaAdquicicion, nivelCarga, contador, estado);
        this.memoriaSDlibre = memoriaSDlibre;
    }

    public double getmemoriaSDlibre() {
        return memoriaSDlibre;
    }

    public void setmemoriaSDlibre(double memoriaSDlibre) {
        this.memoriaSDlibre = memoriaSDlibre;
    }
}
