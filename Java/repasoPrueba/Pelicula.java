package Java.repasoPrueba;

import U1.Persona;

import java.util.ArrayList;

public class Pelicula {
    private String nombre, genero;
    private int duracion;
    private ArrayList<Persona> Directores = new ArrayList<>();
    private ArrayList<Persona> Actores = new ArrayList<>();
    private ArrayList<String> Lenguajes = new ArrayList<>();

    public Pelicula(String nombre, String genero, int duracion) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
    }

    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setGenero(String genero){ this.genero = genero; }
    public void setDuracion(int duracion){ this.duracion = duracion; }
    public void setDirectores(ArrayList<Persona> Directores){ this.Directores = Directores; }
    public void setActores(ArrayList<Persona> Actores){ this.Actores = Actores; }
    public void setLenguajes(ArrayList<String> Lenguajes){ this.Lenguajes = Lenguajes; }

    public String getNombre(){ return this.nombre; }
    public String getGenero(){ return this.genero; }
    public int getDuracion(){ return this.duracion; }
    public ArrayList<Persona> getDirectores(){ return this.Directores; }
    public ArrayList<Persona> getActores(){ return this.Actores; }
    public ArrayList<String> getLenguajes(){ return this.Lenguajes; }

    public void agregarDirectores(Persona nombreDirector){ this.Directores.add(nombreDirector); }
    public void agregarActores(Persona actor){ this.Actores.add(actor); }
    public void agregarLenguajes(String lenguaje){ this.Lenguajes.add(lenguaje); }

    public void borrarDirector(Persona director){
        for (Persona p:Directores){
            if (p == director){ Directores.remove(director); }
        }
    }

    public void borrarActor(Persona actor){
        for (Persona p:Actores){
            if (p == actor){ Directores.remove(actor); }
        }
    }

    public void borrarLenguaje(String lenguaje){
        for (String l:Lenguajes){
            if (l == lenguaje){ Lenguajes.remove(lenguaje); }
        }
    }

    public ArrayList<Persona> mayorEdad(){
        ArrayList<Persona> mayoresDeEdad = new ArrayList<>();
        for (Persona p:Actores){
            if (p.getEdad() > 18){
                mayoresDeEdad.add(p);
            }
        }
        return mayoresDeEdad;
    }
}
