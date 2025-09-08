package U8;

import U5.bebidas.Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador implements Mensajero {
    private String nombre, apellido, direccionResidencia;
    private int dni, nroCuil, sueldo;
    private LocalDate fechaNacimiento;
    private LocalTime inicioHorario, finHorario;

    @Override
    public void enviarMensaje(String msg) {
        if (inicioHorario.isBefore(LocalTime.now()) && finHorario.isAfter(LocalTime.now()) ){
            System.out.println("Yo, " + nombre + " te invito a que " + msg);
        } else {
            System.out.println("No esta en su horario laboral");
        }
    }
}

