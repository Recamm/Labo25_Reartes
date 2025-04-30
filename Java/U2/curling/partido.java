package U2.curling;

import U1.Fecha;

import java.time.LocalDate;

public class partido {
    LocalDate fecha;
    char turno;
    equipo Equipo1 = new equipo();
    equipo Equipo2 = new equipo();

    public partido() {
    }

    public partido(LocalDate fecha, char turno, equipo equipo1, equipo equipo2) {
        this.fecha = fecha;
        this.turno = turno;
        Equipo1 = equipo1;
        Equipo2 = equipo2;
    }
}
