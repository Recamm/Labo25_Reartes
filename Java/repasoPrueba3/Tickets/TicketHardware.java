package repasoPrueba3.Tickets;

import repasoPrueba3.Default.Estado;
import repasoPrueba3.Gente.Cliente;
import repasoPrueba3.Gente.Desarrollador;
import repasoPrueba3.Otros.Dispositivo;

public class TicketHardware extends Ticket{
    private Dispositivo dispositivo;

    public TicketHardware(Cliente cliente, String descripcion, Dispositivo dispositivo){
        super(cliente, descripcion);
        this.dispositivo = dispositivo;
    }

    @Override
    public boolean resolver(){
        if (this.dispositivo.isHayRepuestos()){
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
