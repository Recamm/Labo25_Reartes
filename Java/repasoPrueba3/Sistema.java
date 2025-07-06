package repasoPrueba3;

import repasoPrueba3.Default.Estado;
import repasoPrueba3.Gente.Desarrollador;
import repasoPrueba3.Tickets.Ticket;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private ArrayList<Desarrollador> desarrolladores = new ArrayList<>();

    public int cantTicketsIn(Estado estado) {
        int contador = 0;
        for (Ticket t : tickets) {
            if (t.getEstado().equals(estado)) {
                contador++;
            }
        }
        return contador;
    }

    public int cantAllTickets() {
        return tickets.size();
    }

    public Ticket olderOpen() {
        Ticket older = tickets.get(0);
        for (Ticket t : tickets) {
            if (t.getDtCracion().isBefore(older.getDtCracion()) && older.getEstado().equals(Estado.ABIERTO) && older.getDesarrolladores().isEmpty()) {
                older = t;
            }
        }
        return older;
    }

    public Desarrollador topDesarrollador() {
        Desarrollador dev = desarrolladores.get(0);
        for (Desarrollador d : desarrolladores) {
            if (d.getTicketsResueltos() > dev.getTicketsResueltos()) {
                dev = d;
            }
        }
        return dev;
    }

    public ArrayList<Ticket> cantTicketsWorking(Desarrollador dev) {
        return dev.getWorkingOn();
    }

    public Desarrollador olderDev() {
        Desarrollador d = desarrolladores.get(0);
        for (Desarrollador dev : desarrolladores) {
            if (dev.getIngreso().isBefore(d.getIngreso())) {
                d = dev;
            }
        }
        return d;
    }

    public ArrayList<Desarrollador> desarrolladoresWorkingOn(Ticket tk) {
        return tk.getDesarrolladores();
    }

    public LocalDate ticketART() {
        int cant = 0, yy = 0, MM = 0, dd = 0;
        for (Ticket tk : tickets) {
            cant++;
            Period diff = Period.between(tk.getDtCracion().toLocalDate(), tk.getDtFinalizacion().toLocalDate());
            yy += diff.getYears();
            MM += diff.getMonths();
            dd += diff.getDays();
        }
        yy /= cant;
        MM /= cant;
        dd /= cant;
        return LocalDate.of(yy, MM, dd);
    }

    public static void main(String[] args){

    }
    
}