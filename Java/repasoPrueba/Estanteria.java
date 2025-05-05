package Java.repasoPrueba;

import java.util.ArrayList;

public class Estanteria {
    private int numero;
    private ArrayList<Pelicula> Peliculas = new ArrayList<>();

    public Estanteria(int numero){
        if (numero > 0){ this.numero = numero; }
    }

    public void setNumero(int numero){ if (numero > 0){ this.numero = numero; } }
    public void setPeliculas(ArrayList<Pelicula> Peliculas){ this.Peliculas = Peliculas; }

    public int getNumero(){ return this.numero; }
    public ArrayList<Pelicula> getPeliculas(){ return this.Peliculas; }

    public void agregarPelicula(Pelicula pelicula){ this.Peliculas.add(pelicula); }
}
