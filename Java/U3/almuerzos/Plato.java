package U3.almuerzos;

public class Plato {
    private String nombre;
    private int precio;
    private int cantidadPedidos;

    public Plato(String nombre, int precio, int cant) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadPedidos = cant;
    }
    
    public Plato(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadPedidos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadPedidos() {
        return cantidadPedidos;
    }

    public void setCantidadPedidos(int cantidadPedidos) {
        this.cantidadPedidos = cantidadPedidos;
    }

    public void incrementarCantidad(){
        this.cantidadPedidos++;
    }

}
