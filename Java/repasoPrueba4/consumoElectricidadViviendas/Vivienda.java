package repasoPrueba4.consumoElectricidadViviendas;

import java.util.HashMap;
import java.util.HashSet;

public abstract class Vivienda {
    private String direccion;
    private int codigoPostal;
    private Duenio duenio;
    private HashSet<Consumo> consumos;

    public Vivienda(String direccion, int codigoPostal, Duenio duenio) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.duenio = duenio;
        this.consumos = new HashSet<>();
    }

    public abstract int getPrecioKWh();

    public int calcGasto(int KWh){
        Consumo consumo = new Consumo(KWh);
        int precio = consumo.getKWh() * getPrecioKWh();

        Consumo consumoAnioAnterior = null;
        for (Consumo c:consumos){
            if (consumo.getFecha().getMonth() == c.getFecha().getMonth() && consumo.getFecha().getYear() == c.getFecha().getYear()-1){
                consumoAnioAnterior = c;
            }
        }

        if (consumoAnioAnterior != null){
            if (consumoAnioAnterior.getKWh()*0.9 < consumo.getKWh()){
                precio *= 0.95;
            }
        }

        return precio;
    }

    public void cargarConsumoElectricidad(int KWh){
        Consumo consumo = new Consumo(KWh);
        this.consumos.add(consumo);
    }
}