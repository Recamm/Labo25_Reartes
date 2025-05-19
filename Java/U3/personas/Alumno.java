package Java.U3.personas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
    private ArrayList<Integer> listaNotas = new ArrayList<>();
    private ArrayList<U2.Materia> materias = new ArrayList<>();

    public Alumno(String nombre, String apellido, String direccion, int edad, LocalDate fechaNacimiento) {
        super(nombre, apellido, direccion, edad);
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void agregarNota (Integer notaAgregar) {
        this.listaNotas.add(notaAgregar);
    }

    public int mayorNota (){
        int mayor = this.listaNotas.get(0);
        for (Integer nota:this.listaNotas){
            if (nota > mayor){
                mayor = nota;
            }
        }
        return mayor;
    }

    public int menor (){
        int menor = this.listaNotas.get(0);
        for (Integer nota:this.listaNotas){
            if (nota < menor){
                menor = nota;
            }
        }
        return menor;
    }

    public int promedioNotas(){
        int suma = 0;
        for (int n:this.listaNotas){
            suma += n;
        }
        suma /= this.listaNotas.size();
        return suma;
    }

    public void agregarMateria(U2.Materia materia){
        this.materias.add(materia);
        materia.agregarAlumnos(this);
    }
}
