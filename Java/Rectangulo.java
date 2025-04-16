package Unidad1;

public class Rectangulo {
    private int base, altura;

    public Rectangulo(int base2, int altura2){
        base = base2;
        altura = altura2;
    }

    public int getBase(){
        return base;
    }

    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double calcularArea(){
        double calculo = base * altura;
        return calculo;
    }

    public double calculoPerimetro(){
        double calculo = base*2 + altura*2;
        return calculo;
    }
}
