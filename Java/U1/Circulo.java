package U1;

public class Circulo {
    // Atributo
    private int radio;

    // Atributos Def
    public Circulo(){
        this.radio = 2;
    }

    // Atributos con valor elejido
    public Circulo(int radio){
        this.radio = radio;
    }

    // Metodos
    public int getRadio(){
        return radio;
    }

    public void setRadio(int radio){
        this.radio = radio;
    }

    public double calcularArea(){
        double cuenta = Math.PI * radio * radio;
        return cuenta;
    }

    public double calcularPerimetro(){
        double cuenta = 2 * Math.PI * radio;
        return cuenta;
    }
}
