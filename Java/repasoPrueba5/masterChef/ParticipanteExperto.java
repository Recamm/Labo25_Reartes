package repasoPrueba5.masterChef;

import U5.recetas.PlatoPrincipal;

public class ParticipanteExperto extends Participante implements PlatoEntrada, PlatoPrincipal {
    private static int tiempoLimite = 80;
    private int tiempoRestante;

    @Override
    public void prepararTrabajo(){
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es: " + tiempoRestante);
    }

    @Override
    public void cocinarPlato() {

    }
}
