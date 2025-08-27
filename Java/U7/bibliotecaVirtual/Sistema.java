package U7.bibliotecaVirtual;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Libro> libros = new HashSet<>();
    private HashMap<Usuario, HashSet<Libro>> librosUsuariosAlquilados = new HashMap<>();

    public void alquilarLibro(Usuario usuario, Libro libro){
        HashSet<Libro> hsL = new HashSet<>();
        if (librosUsuariosAlquilados.containsKey(usuario)){
            hsL = librosUsuariosAlquilados.get(usuario);
            hsL.add(libro);
        }
        librosUsuariosAlquilados.put(usuario, hsL);
        libro.alquilarLibro();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro){
        libros.remove(libro);
    }

    public void modificarLibro(Libro libroAntiguo, Libro libroActual){
        libros.remove(libroAntiguo);
        libros.add(libroActual);
    }

}