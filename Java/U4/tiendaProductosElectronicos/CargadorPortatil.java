package U4.tiendaProductosElectronicos;

public class CargadorPortatil extends Cargadores{
    private float cantCargas;

    public CargadorPortatil(String nombre, int precio, int stock, float cantCargas) {
        super(nombre, precio, stock);
        this.cantCargas = cantCargas;
    }
}
