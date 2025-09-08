package U8;

public abstract class Dispositivo {
    private String fabricante, modelo, nroDeSerie;

    public Dispositivo(String fabricante, String modelo, String nroDeSerie) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.nroDeSerie = nroDeSerie;
    }
}
