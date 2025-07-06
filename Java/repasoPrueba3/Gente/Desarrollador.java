package repasoPrueba3.Gente;

import repasoPrueba3.Tickets.Ticket;
import repasoPrueba3.Tickets.TicketHardware;

import java.time.LocalDate;
import java.util.ArrayList;

public class Desarrollador extends Persona{
    private int ticketsResueltos;
    private ArrayList<Ticket> workingOn;
    private LocalDate ingreso;

    public Desarrollador(int nombre, int apellido) {
        super(nombre, apellido);
        this.ticketsResueltos = 0;
        this.ingreso = LocalDate.now();
        this.workingOn = new ArrayList<>();
    }

    public int getTicketsResueltos() {
        return ticketsResueltos;
    }

    public void agregarTicketResuelto() {
        this.ticketsResueltos++;
    }

    public void addTicketWorkingOn(Ticket tk){
        this.workingOn.add(tk);
    }

    public ArrayList<Ticket> getWorkingOn(){
        return this.workingOn;
    }

    public LocalDate getIngreso(){
        return this.ingreso;
    }
}
