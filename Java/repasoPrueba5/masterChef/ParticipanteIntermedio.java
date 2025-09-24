package repasoPrueba5.masterChef;

import java.util.HashMap;
import java.util.Map;

public class ParticipanteIntermedio extends Participante implements PlatoPrincipal{
    private HashMap<String, Integer> ingredientesCantidad;
    // No se si es mejor crear una clase ingredientes, y con interfaces hacer el stock, o con el HashMap

    @Override
    public void prepararTrabajo(){
        System.out.println("Mi stock a utilizar es de ");
        for (Map.Entry<String, Integer> ingCant:ingredientesCantidad.entrySet()){
            if (ingCant.getValue() > 1){
                System.out.println(ingCant.getKey());
            }
        }
    }

    @Override
    public void cocinarPlato() {

    }
}
