package U1;

public class Coche {
    private String marca, modelo;
    private int velocidad;
    private Colores color;

    public Coche(String modelo, String marca, Colores color) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public void acelerar(int aceleracion){
        this.velocidad += aceleracion;
    }

    public void frenar(){
        this.velocidad = 0;
    }

    public void verVelocidadActual(){
        System.out.println("Velociadad actual --> " + this.velocidad);
    }
}
