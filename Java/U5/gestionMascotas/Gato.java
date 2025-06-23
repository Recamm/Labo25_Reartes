package U5.gestionMascotas;

public class Gato extends Mascota{
    public Gato(String nombre, Usuario usuario) {
        super(nombre, usuario);
    }

    @Override
    public String saludo() {
        return "miau";
    }

    @Override
    public String queSoy() {
        return "Gato";
    }
}
