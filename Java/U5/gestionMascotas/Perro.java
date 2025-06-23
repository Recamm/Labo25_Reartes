package U5.gestionMascotas;

public class Perro extends Mascota{
    public Perro(String nombre, Usuario usuario) {
        super(nombre, usuario);
    }

    @Override
    public String saludo() {
        return "guau";
    }

    @Override
    public String queSoy() {
        return "Perro";
    }
}
