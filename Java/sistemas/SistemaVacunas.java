package sistemas;

import personas.Ciudadano;
import vacunas.Vacuna;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaVacunas {
    HashSet<Ciudadano> ciudadanos = new HashSet<>();
    HashSet<Vacuna> vacunas = new HashSet<>();
    HashMap<Ciudadano, HashSet<Vacuna>> vacunasAplicadas = new HashMap<>();

    public void aplicarVacuna(Ciudadano ciudadano, Vacuna vacuna){
        if (vacunasAplicadas.containsKey(ciudadano)){
            vacunasAplicadas.get(ciudadano).add(vacuna);
        } else {
            HashSet<Vacuna> vac = new HashSet<>();
            vac.add(vacuna);
            vacunasAplicadas.put(ciudadano, vac);
        }
    }

    public void historialVacunacion(int dni){
    }

}
