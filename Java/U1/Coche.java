package U1;

public class Coche {
    private String marca, modelo, color;
    private int velocidad;

    public Coche(String modelo, String marca, String color) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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
