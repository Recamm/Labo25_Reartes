package U3.controlLlamadas;

import java.util.ArrayList;
import java.util.Collections;

public class Sistema {
    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<LlamadaDatos> llamadas = new ArrayList<>();
    ArrayList<ArrayList<LlamadaDatos>> llamadasPorEmpleado = new ArrayList<>();

    public Empleado queEmpleado(ArrayList<LlamadaDatos> llamDt){
        for (Empleado e:this.empleados){
            int cant = 0;
            for (LlamadaDatos lld:llamDt){
                if (lld.getOrigen() == e || lld.getDestino() == e){
                    cant++;
                } else {
                    break;
                }
            }
            if (llamDt.size() == cant){
                return e;
            }
        }
        return null;
    }

    public void listaEmpleado(){
        for (LlamadaDatos lld:this.llamadas){
            for (ArrayList<LlamadaDatos> LLxE1:this.llamadasPorEmpleado){
                if (lld.getDestino() == queEmpleado(LLxE1)){
            }
        }
    }

//    public static void main(String[] args) {
//        for (LlamadaDatos lld:llamadas){
//            for (ArrayList<LlamadaDatos> LLxE1:llamadasPorEmpleado){
//                boolean esta = false;
//                int cant = Collections.frequency(LLxE1, );
//            }
//            llamadasPorEmpleado.add(new ArrayList<>());
//            llamadasPorEmpleado.get(0).add();
//        }
//    }

        //TODO
}
