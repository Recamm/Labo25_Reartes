package U2;

import U1.Cancion;

import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> canciones = new ArrayList<Cancion>();

    public CD(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int numCanciones(){ return canciones.size(); }

    public String verCancion(int posicion){ return canciones.get(posicion).getTitulo(); }

    public void grabarCancion(int posicion, Cancion nuevaCancion){ canciones.set(posicion, nuevaCancion); }

    public void agregarCancion(Cancion nuevaCancion){ canciones.add(nuevaCancion); }

    public void eliminarCancion(int posicion){ canciones.remove(posicion); }
}
