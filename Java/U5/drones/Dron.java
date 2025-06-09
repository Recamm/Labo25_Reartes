package U5.drones;

import java.time.LocalDate;

public class Dron {
    private Tipo tipo;
    private String nombreModelo;
    private LocalDate fechaAdquicicion;
    private int nivelCarga, contador;
    private Estado estado;

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
