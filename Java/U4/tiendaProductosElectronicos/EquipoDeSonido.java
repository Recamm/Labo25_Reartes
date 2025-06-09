package U4.tiendaProductosElectronicos;

public class EquipoDeSonido extends Multimedia{
    private boolean bluetooth;

    public EquipoDeSonido(String nombre, int precio, int stock, boolean bluetooth) {
        super(nombre, precio, stock);
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
