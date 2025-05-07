package Java.repasoPrueba1;

import java.util.ArrayList;

public class VideoClub {
    private String direccion, comuna;
    private int codigoPostal, cantPeliculas;
    private ArrayList<Estanteria> Estanterias = new ArrayList<>();

    public VideoClub(String direccion, int codigoPostal, String comuna) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.comuna = comuna;
        this.cantPeliculas = 0;
    }

    public void setDireccion(String direccion){ this.direccion = direccion; }
    public void setCodigoPostal(int codigoPostal){ this.codigoPostal = codigoPostal; }
    public void setEstanterias(ArrayList<Estanteria> Estanterias){ this.Estanterias = Estanterias; }
    public void setComuna(String comuna){ this.comuna = comuna; }

    public String getDireccion(){ return this.direccion; }
    public int getCodigoPostal(){ return this.codigoPostal; }
    public ArrayList<Estanteria> getEstanterias(){ return this.Estanterias; }
    public String getComuna(){ return this.comuna; }
    public int getCantPeliculas(){ return this.cantPeliculas; }

    public void agregarEstanteria(Estanteria estanteria){ this.Estanterias.add(estanteria); cantPeliculas += estanteria.getPeliculas().size(); }

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

    public void verificarCantPeliculas(){
        this.cantPeliculas = 0;
        for (Estanteria e:this.Estanterias){
            this.cantPeliculas += e.getPeliculas().size();
        }
    }

    public ArrayList<Pelicula> peliculaGenero(String genero){
        ArrayList<Pelicula> peliculasGen = new ArrayList<>();
        for (Estanteria e:this.Estanterias){
            for (Pelicula p:e.getPeliculas()){
                if (p.getGenero() == genero){
                    peliculasGen.add(p);
                }
            }
        }
        return peliculasGen;
    }

}
