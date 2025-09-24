package repasoPrueba5.masterChef;

import java.util.HashSet;

public class ParticipantePrincipiante extends Participante implements PlatoEntrada{
    private HashSet<String> ingredientesProhibidos;

    @Override
    public void prepararTrabajo(){
        System.out.println("Ya guarde todos los elementos prohibidos y no voy a usar: ");
        for (String ing:ingredientesProhibidos){
            System.out.println(ing);
        }
    }

    @Override
    public void cocinarPlato() {

    }
}
