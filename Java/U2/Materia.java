package U2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<String> contenidos = new ArrayList<String>();
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public void agregarAlumnos(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public int promedioEdadAlumnos(){
        int sum = 0;
        for (Alumno a:this.alumnos){
            sum += a.getEdad();
        }
        sum /= this.alumnos.size();
        return sum;
    }
}