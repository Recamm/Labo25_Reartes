package U7.sistemaComponentes;

public class PerifericosSalida extends Componentes {
    private String nombre, tipoConector;

    public PerifericosSalida(String fabricante, String modelo, int precio, int stock, String nombre, String tipoConector) {
        super(fabricante, modelo, precio, stock);
        this.nombre = nombre;
        this.tipoConector = tipoConector;
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
}
