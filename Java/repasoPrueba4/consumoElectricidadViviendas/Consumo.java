package repasoPrueba4.consumoElectricidadViviendas;

import java.time.LocalDate;

public class Consumo {
    private LocalDate fecha;
    private int KWh;

    public Consumo(int KWh) {
        this.fecha = LocalDate.now();
        this.KWh = KWh;
    }

    public Consumo(LocalDate fecha, int KWh) {
        this.fecha = fecha;
        this.KWh = KWh;
    }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public int getKWh() { return KWh; }
    public void setKWh(int KWh) { this.KWh = KWh; }
}