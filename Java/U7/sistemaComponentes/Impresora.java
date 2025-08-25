package U7.sistemaComponentes;

public class Impresora extends PerifericosSalida {
    private String metodoImpresion;
    private boolean inyeccionLaser; //true: inyeccion, false: laser

    public Impresora(String fabricante, String modelo, int precio, int stock, String nombre, String tipoConector, boolean inyeccionLaser, String metodoImpresion) {
        super(fabricante, modelo, precio, stock, nombre, tipoConector);
        this.inyeccionLaser = inyeccionLaser;
        this.metodoImpresion = metodoImpresion;
    }

    public String getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(String metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }

    public boolean isInyeccionLaser() {
        return inyeccionLaser;
    }

    public void setInyeccionLaser(boolean inyeccionLaser) {
        this.inyeccionLaser = inyeccionLaser;
    }
}
