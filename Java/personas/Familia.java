package personas;

import java.util.HashSet;

public class Familia {
    private HashSet<Persona> personas;

    public Familia(HashSet<Persona> personas) {
        this.personas = personas;
    }

    public HashSet<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(HashSet<Persona> personas) {
        this.personas = personas;
    }

    public int promedioCalorias(){
        int calorias = 0;
        for (Persona p:personas){
            calorias += p.cantCaloriasTotales();
        }
        calorias/=personas.size();
        return calorias;
    }

    public Persona personaMasCalorias(){
        Persona persona = new Persona("", "", 0);
        for (Persona p:personas){
            if (p.cantCaloriasTotales() > persona.cantCaloriasTotales()){
                persona = p;
            }
        }
        return persona;
    }

    public Persona personaMenosCalorias(){
        Persona persona = new Persona("", "", 0);
        for (Persona p:personas){
            if (p.cantCaloriasTotales() < persona.cantCaloriasTotales()){
                persona = p;
            }
        }
        return persona;
    }

}
