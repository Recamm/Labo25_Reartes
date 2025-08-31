package repasoPrueba4.consumoElectricidadViviendas;

import java.util.HashSet;

public class Depto extends Vivienda{
    private int cantAmbientes;

    public Depto(String direccion, int codigoPostal, Duenio duenio, HashSet<Consumo> consumos, int cantAmbientes) {
        super(direccion, codigoPostal, duenio, consumos);
        this.cantAmbientes = cantAmbientes;
    }

    @Override
    public int getPrecioKWh(){
        return 50;
    }
}
