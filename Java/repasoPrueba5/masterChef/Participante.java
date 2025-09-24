package repasoPrueba5.masterChef;

import java.time.LocalDate;

public abstract class Participante {
    private String nombre, apellido, localidad;
    private LocalDate fechaNacimiento;
    private Color equipoColor;

    public abstract void prepararTrabajo();
    public abstract void cocinarPlato();
}
