package repasoPrueba3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TicketSoftware extends Ticket{
    private int intentos;

    public TicketSoftware(Cliente cliente, String descripcion, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFinal, ArrayList<Comentario> comentarios, Estado estado) {
        super(cliente, descripcion, fechaHoraInicio, fechaHoraFinal, comentarios, estado);
        this.intentos = 3;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void aplicarParche(boolean funciona){
        if (){

        }
    }
}