package U5.gestionMascotas;

public abstract class Mascota {
    private Usuario usuario;
    private String nombre;
    private int alegria;

    public Mascota(String nombre, Usuario usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.alegria = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getAlegria() {
        return alegria;
    }

    public void aumentoAlegria(){
        this.alegria++;
    }

    public abstract String saludo();

    public String saludar() {
        if (alegria != 1){
            alegria--;
        }
        String saludo = "";
        String saludoContenido = saludo();
        for (int i = 0; i < this.getAlegria(); i++){
            saludo += saludoContenido;
            saludo += " ";
        }
        return saludoContenido;
    }

    public void alimentar(){
        if(this.alegria < 3){
            aumentoAlegria();
        }
    };

    public abstract String queSoy();
}
