package U8.eleccionesOctubre;

public class TelefonoMoviles extends Dispositivo implements Mensajero {
    private int nroCelular, creditosDisponibles;
    private Boolean encendido;
    private Compania compania;

    public TelefonoMoviles(String fabricante, String modelo, String nroDeSerie, int nroCelular, int creditosDisponibles, Boolean encendido, Compania compania) {
        super(fabricante, modelo, nroDeSerie);
        this.nroCelular = nroCelular;
        this.creditosDisponibles = creditosDisponibles;
        this.encendido = encendido;
        this.compania = compania;
    }

    @Override
    public void enviarMensaje(String msg) {
        if ((creditosDisponibles > 0) && encendido){
            System.out.println("Conectando con la antena más cercana: " + msg);
        } else {
            System.out.println("Celular sin creditos o apagado");
        }
    }
}
