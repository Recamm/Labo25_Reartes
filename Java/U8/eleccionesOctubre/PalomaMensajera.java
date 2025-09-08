package U8.eleccionesOctubre;

public class PalomaMensajera extends Ave implements Mensajero {
    private Boolean aprendioMapa;

    public PalomaMensajera(String color, String nombre, String especie, Boolean aprendioMapa) {
        super(color, nombre, especie);
        this.aprendioMapa = aprendioMapa;
    }

    @Override
    public void enviarMensaje(String msg) {
        if (aprendioMapa){
            System.out.println("Lanzando un papelito que dice: " + msg);
        } else {
            System.out.printf("No sabe el mapa");
        }
    }
}
