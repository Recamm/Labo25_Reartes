package U1;

public enum Colores {
    ROJO("ff0000"), AZUL("0087ff"), VERDE("00ff23"), AMARILLO("fbff00");

    private String colorHexa;

    private Colores(String colorHexa){
        this.colorHexa = colorHexa;
    }
}
