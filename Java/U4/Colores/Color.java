package U4.Colores;

public enum Color {
    ROJO("ff0000"), AZUL("0087ff"), VERDE("00ff23"), AMARILLO("fbff00");

    private String colorHexa;

    private Color(String colorHexa){
        this.colorHexa = colorHexa;
    }
}
