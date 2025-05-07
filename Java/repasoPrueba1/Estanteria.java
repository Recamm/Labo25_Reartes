package Java.repasoPrueba1;

import java.util.ArrayList;

import U1.Persona;

public class Estanteria {
    private int numero;
    private ArrayList<Pelicula> Peliculas;

    public Estanteria(int numero){
        if (numero > 0){ this.numero = numero; }
        Peliculas = new ArrayList<>();
    }

    public void setNumero(int numero){ if (numero > 0){ this.numero = numero; } }
    public void setPeliculas(ArrayList<Pelicula> Peliculas){ this.Peliculas = Peliculas; }

    public int getNumero(){ return this.numero; }
    public ArrayList<Pelicula> getPeliculas(){ return this.Peliculas; }

    public void agregarPelicula(Pelicula pelicula){ this.Peliculas.add(pelicula); }

    public ArrayList<Persona> directoresRepetidos(){
        ArrayList<Persona> directores = new ArrayList<>();
        for (Pelicula p:this.Peliculas){
            directores.addAll(p.getDirectores());
        }
        ArrayList<Persona> directoresRepe = new ArrayList<>();
        for (int i = 0; i < directores.size(); i++){
            for (int ii = 0; ii < directores.size(); ii++){
                if (directores.get(i) == directores.get(ii) && i != ii){
                    directoresRepe.add(directores.get(i));
                }
            }
        }
        return directoresRepe;
    }

}
