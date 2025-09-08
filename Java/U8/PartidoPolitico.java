package U8;

import java.util.HashSet;

public class PartidoPolitico {
    private String nombre, direccion, ubicacionOficinaCentral;
    private int cantAfiliados;
    private HashSet<Mensajero> mensajeros;

    public PartidoPolitico(String nombre, String direccion, String ubicacionOficinaCentral, int cantAfiliados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ubicacionOficinaCentral = ubicacionOficinaCentral;
        this.cantAfiliados = cantAfiliados;
        this.mensajeros = new HashSet<>();
    }

    public void hacerCampania(){
        for (Mensajero m:mensajeros){
            m.enviarMensaje("Vote por el partido para un mejor futuro");
        }
    }
}
