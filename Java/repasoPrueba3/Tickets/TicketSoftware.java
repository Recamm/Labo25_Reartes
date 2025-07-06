package repasoPrueba3.Tickets;

import repasoPrueba3.Default.Estado;
import repasoPrueba3.Gente.Cliente;
import repasoPrueba3.Gente.Desarrollador;
import repasoPrueba3.Otros.Dispositivo;

public class TicketSoftware extends Ticket{
    private static int intentosFijos = 3;
    private int intentosRestantes;
    private boolean parcheAplicable;

    public TicketSoftware(Cliente cliente, String descripcion){
        super(cliente, descripcion);
        this.intentosRestantes = intentosFijos;
        this.parcheAplicable = false;
    }

    public void agregarParche(){
        this.parcheAplicable = true;
    }

    @Override
    public boolean resolver(){
        if (this.intentosRestantes > 0 && this.parcheAplicable){
            this.cambiarEstado(Estado.RESUELTO);
            for (Desarrollador dev:this.getDesarrolladores()){
                dev.agregarTicketResuelto();
            }
            return true;
        } else {
            return false;
        }
    }
}
