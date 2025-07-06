package repasoPrueba3.Otros;

public class Dispositivo {
    private String nombre;
    private boolean hayRepuestos;

    public Dispositivo(String nombre, boolean hayRepuestos){
        this.nombre = nombre;
        this.hayRepuestos = hayRepuestos;
    }

    public boolean isHayRepuestos(){
        return this.hayRepuestos;
    }
}
