package repasoPrueba3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TicketHardware extends Ticket{
    private Dispositivo dispositivo;

    public TicketHardware(Cliente cliente, String descripcion, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFinal, ArrayList<Comentario> comentarios, Estado estado, Dispositivo dispositivo) {
        super(cliente, descripcion, fechaHoraInicio, fechaHoraFinal, comentarios, estado);
        this.dispositivo = dispositivo;
        actualizacionEstado();
    }

    public void actualizacionEstado(){
        if (dispositivo.isHayRepuestos()){
            this.setEstado(Estado.RESUELTO);
        } else {
            this.setEstado(Estado.CANCELADO);
        }
    }
}
