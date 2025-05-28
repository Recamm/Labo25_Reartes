package U3.pcPersonalizadas;

public class PerifericosEntrada extends Componentes{
    private String nombre, tipoConector, puertos;

    public PerifericosEntrada(String fabricante, String modelo, int precio, int stock, String nombre, String tipoConector, String puertos, int cantPuertos) {
        super(fabricante, modelo, precio, stock);
        this.nombre = nombre;
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public String getPuertos() {
        return puertos;
    }

    public void setPuertos(String puertos) {
        this.puertos = puertos;
    }
}
