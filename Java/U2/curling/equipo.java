package U2.curling;

import java.util.ArrayList;

public class equipo {
    private String nombre, barrio, disponibilidadHoraria;
    private ArrayList<jugador> jugadores = new ArrayList<>();

    public equipo(String nombre, String barrio, String disponibilidadHoraria) {
        this.nombre = nombre;
        this.barrio = barrio;
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public void agregarJugador(jugador j){
        this.jugadores.add(j);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    public void setDisponibilidadHoraria(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public ArrayList<jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String texto(String texto){
        return texto;
    }

    public void setNumCamiseta(jugador j, int numeroCamiseta){
        if (numeroCamiseta > 0 && numeroCamiseta < 100){
            boolean verify = true;
            for (jugador jug:this.jugadores){
                if (j.getNumeroCamiseta() == jug.getNumeroCamiseta()){
                    texto("Numero de camiseta ya esta seleccionado!");
                    verify = false;
                }
            }
            for (int i = 0; i < this.jugadores.size();){
                if (this.jugadores.get(i) == j){
                    jugador ejemplo = new jugador(this.jugadores.get(i).getNombre(), this.jugadores.get(i).getNacimiento());
                    ejemplo.setNumeroCamiseta(numeroCamiseta);
                    this.jugadores.set(i, ejemplo);
                }
            }
        }
    }
}
