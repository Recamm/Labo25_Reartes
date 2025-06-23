package U5.gestionMascotas;

public class Pez extends Mascota{
    private int vidas;

    public Pez(String nombre, Usuario usuario) {
        super(nombre, usuario);
        this.vidas = 10;
    }

    public int getVidas() {
        return vidas;
    }

    @Override
    public void alimentar() {
        vidas++;
    }

    @Override
    public String saludo() {
        vidas--;
        return "";
    }

    @Override
    public String queSoy() {
        return "Pez";
    }
}
