package repasoPrueba4.consumoElectricidadViviendas;

import java.util.HashSet;

public class Casa extends Vivienda{
    private int metrosCubiertos, metrosDescubiertos;

    public Casa(String direccion, int codigoPostal, Duenio duenio, HashSet<Consumo> consumos, int metrosCubiertos, int metrosDescubiertos) {
        super(direccion, codigoPostal, duenio, consumos);
        this.metrosCubiertos = metrosCubiertos;
        this.metrosDescubiertos = metrosDescubiertos;
    }

    @Override
    public int getPrecioKWh(){
        return 100;
    }
}
