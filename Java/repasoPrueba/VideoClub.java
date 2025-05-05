package Java.repasoPrueba;

import java.util.ArrayList;

public class VideoClub {
    private String direccion;
    private int codigoPostal;
    private ArrayList<Estanteria> Estanterias = new ArrayList<>();

    public VideoClub(String direccion, int codigoPostal) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
    }

    public void setDireccion(String direccion){ this.direccion = direccion; }
    public void setCodigoPostal(int codigoPostal){ this.codigoPostal = codigoPostal; }
    public void setEstanterias(ArrayList<Estanteria> Estanterias){ this.Estanterias = Estanterias; }

    public String getDireccion(){ return this.direccion; }
    public int getCodigoPostal(){ return this.codigoPostal; }
    public ArrayList<Estanteria> getEstanterias(){ return this.Estanterias; }

    public void agregarEstanteria(Estanteria estanteria){ this.Estanterias.add(estanteria); }

    public Pelicula peliculaMayorDuracion(){
        Pelicula mayorDuracion = this.Estanterias.get(0).getPeliculas().get(0);
        for (Estanteria est:this.Estanterias){
            for (Pelicula peli:est.getPeliculas()){
                if (peli.getDuracion() > mayorDuracion.getDuracion()){
                    mayorDuracion = peli;
                }
            }
        }
        return mayorDuracion;
    }

    public Estanteria estanteriaConPeliculaEspecifica(Pelicula pelicula){
        Estanteria estanteria = new Estanteria(0);
        for (Estanteria est:this.Estanterias){
            for (Pelicula peli:est.getPeliculas()){
                if (peli == pelicula){
                    return est;
                }
            }
        }
        return estanteria;
    }
}
