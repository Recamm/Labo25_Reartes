package U3.controlLlamadas;

import java.util.ArrayList;
import java.util.Collections;

public class Sistema {
    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<LlamadaDatos> llamadas = new ArrayList<>();

    public void listadoLlamadasEmpleados(){
        for (Empleado e:empleados){
            System.out.println("Nombre: " + e.getNombre());
            for (LlamadaDatos lld:e.getLlamadas()){
                System.out.println(lld.getFecha() + " - " + lld.getOrigen() + " to " + lld.getDestino() + " - " + lld.getDuracionSegs()/60 + " mins");
            }
        }
    }

    public void listadoLlamadasEmpleado(Empleado empleado){
        System.out.println("Nombre: " + empleado.getNombre());
        for (LlamadaDatos lld:empleado.getLlamadas()){
            System.out.println(lld.getFecha() + " - " + lld.getOrigen() + " to " + lld.getDestino() + " - " + lld.getDuracionSegs()/60 + " mins");
        }
    }

    public void ordenarEmpleadosTiempo(){
        for (int i = 0; i < empleados.size(); i++){
            for (int ii = 0; ii < empleados.size() - i; ii++){
                if (empleados.get(i).getTiempoLlamadaInternacional() > empleados.get(ii).getTiempoLlamadaInternacional())
                Collections.swap(empleados, i, ii);
            }
        }
    }

    public void rankingEmpleadoTiempoExterior(){
        ordenarEmpleadosTiempo();
        for (Empleado e:empleados){
            System.out.println(e.getNombre() + " - " + e.getTiempoLlamadaInternacional() / 60 + " mins");
        }
    }

    public void agregarLlamadas(LlamadaDatos lld){
        this.llamadas.add(lld);
    }
}
