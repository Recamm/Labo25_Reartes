package U1;

public class Cafetera {
    private int cantidadMaxima, cantidadActual;

    public Cafetera() {
        this.cantidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int cantidadActual) {
        this.cantidadMaxima = 1000;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera(int cantidadMaxima, int cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera(){
        this.cantidadActual = this.cantidadMaxima;
    }

    public void servirTaza(int capacidad){
        if (this.cantidadActual >= capacidad){
            this.cantidadActual -= capacidad;
        }
    }

    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }

    public void llenarCafetera(int cantidad){
        this.cantidadActual += cantidad;
        if(this.cantidadActual > this.cantidadMaxima){
            this.cantidadActual = this.cantidadMaxima;
        }
    }
}
