package U5.gestionMascotas;

import javax.swing.*;

public class Pajaro extends Mascota{
    private TipoPajaro tipo;
    private String canto;

    public Pajaro(String nombre, Usuario usuario) {
        super(nombre, usuario);
        this.tipo = TipoPajaro.NO_CANTOR;
        this.canto = "pio";
    }

    public Pajaro(String nombre, Usuario usuario, String canto) {
        super(nombre, usuario);
        this.tipo = TipoPajaro.CANTOR;
        this.canto = canto;
    }

    @Override
    public String saludo() {
        return this.canto;
    }

    @Override
    public String queSoy() {
        return "Pajaro";
    }
}
