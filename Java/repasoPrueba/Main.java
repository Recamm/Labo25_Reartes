package Java.repasoPrueba;

import U1.Persona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pelicula peli1 = new Pelicula("Inception", "Ciencia Ficción", 148);
        peli1.agregarDirectores(new Persona("Christopher Nolan", "direccion 7", 54));
        peli1.agregarActores(new Persona("Leonardo DiCaprio", "direccion 1", 50));
        peli1.agregarActores(new Persona("Joseph Gordon-Levitt", "direccion 2", 44));
        peli1.agregarLenguajes("Inglés");
        peli1.agregarLenguajes("Español");

        Pelicula peli2 = new Pelicula("El Padrino", "Drama", 175);
        peli2.agregarDirectores(new Persona("Francis Ford Coppola", "direccion 8", 86));
        peli2.agregarActores(new Persona("Marlon Brando", "direccion 3", 88));
        peli2.agregarActores(new Persona("Al Pacino", "direccion 4", 84));
        peli2.agregarLenguajes("Inglés");
        peli2.agregarLenguajes("Italiano");

        Pelicula peli3 = new Pelicula("Toy Story", "Animación", 81);
        peli3.agregarDirectores(new Persona("John Lasseter", "direccion 9", 68));
        peli3.agregarActores(new Persona("Tom Hanks", "direccion 5", 68));
        peli3.agregarActores(new Persona("Tim Allen", "direccion 6", 71));
        peli3.agregarLenguajes("Inglés");
        peli3.agregarLenguajes("Español");

        Estanteria estanteria1 = new Estanteria(1);
        estanteria1.agregarPelicula(peli1);
        estanteria1.agregarPelicula(peli2);

        Estanteria estanteria2 = new Estanteria(2);
        estanteria2.agregarPelicula(peli3);

        VideoClub videoClub1 = new VideoClub("Calle Falsa 123", 12345);
        videoClub1.agregarEstanteria(estanteria1);
        videoClub1.agregarEstanteria(estanteria2);


        Pelicula mayorDuracion = videoClub1.peliculaMayorDuracion();
        System.out.println("Pelicula con mayor duracion es: " + mayorDuracion.getNombre() + " con una duracion total de " + mayorDuracion.getDuracion() + " minutos");
        Estanteria estanteriaPeli = videoClub1.estanteriaConPeliculaEspecifica(mayorDuracion);
        if (estanteriaPeli.getNumero() == 0){
            System.out.println("Esta pelicula no esta en ninguna estanteria!");
        } else {
            System.out.println(mayorDuracion.getNombre() + " esta en la estanteria nro " + estanteriaPeli.getNumero());
        }

        System.out.println("Actores mayores de edad de " + peli3.getNombre());
        for (Persona p:peli3.mayorEdad()){

        }
    }
}