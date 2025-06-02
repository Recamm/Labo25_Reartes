package U3.controlLlamadas;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Empleado extends Persona{
    private ArrayList<LlamadaDatos> llamadas;
    public Empleado(String nombre, String apellido, String pais, int numeroTelefo, int numeroDNI) {
        super(nombre, apellido, pais, numeroTelefo, numeroDNI);
        this.llamadas = new ArrayList<>();
    }
}
