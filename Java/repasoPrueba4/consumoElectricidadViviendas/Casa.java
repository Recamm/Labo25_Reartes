package repasoPrueba4.consumoElectricidadViviendas;

import java.util.HashSet;

public class Casa extends Vivienda{
    private int metrosCubiertos, metrosDescubiertos;

    public Casa(String direccion, int codigoPostal, Duenio duenio, int metrosCubiertos, int metrosDescubiertos) {
        super(direccion, codigoPostal, duenio);
        this.metrosCubiertos = metrosCubiertos;
        this.metrosDescubiertos = metrosDescubiertos;
    }

    @Override
    public int getPrecioKWh(){
        return 100;
    }
}
