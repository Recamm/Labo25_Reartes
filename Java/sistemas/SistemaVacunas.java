package sistemas;

import personas.Ciudadano;
import vacunas.Vacuna;

import javax.xml.transform.Source;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaVacunas {
    HashSet<Ciudadano> ciudadanos = new HashSet<>();
    HashSet<Vacuna> vacunas = new HashSet<>();
    HashMap<Ciudadano, HashSet<Vacuna>> vacunasAplicadas = new HashMap<>();
    HashMap<Integer, Ciudadano> dniCiudadano = new HashMap<>();

    public void agregarCiudadano(Ciudadano ciudadano){
        ciudadanos.add(ciudadano);
        dniCiudadano.put(ciudadano.getDni(), ciudadano);
    }

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
        if (!dniCiudadano.containsKey(dni)){
            System.out.println("No existe este ciudadano!");
        } else {
            for (Vacuna vac : vacunasAplicadas.get(dniCiudadano.get(dni))){
                System.out.println(vac.getNombreComercial());
            }
        }
    }

    public void vacunacionPorProvincia(){
        HashMap<String, Integer> provinciaPersonasVacunadas = new HashMap<>();
        for (Ciudadano c:vacunasAplicadas.keySet()){
            String prov = c.getProvincia();
            if (provinciaPersonasVacunadas.containsKey(prov)){
                provinciaPersonasVacunadas.put(prov, provinciaPersonasVacunadas.get(prov) + 1);
            } else {
                provinciaPersonasVacunadas.put(prov, 1);
            }
        }
        for (String provincia : provinciaPersonasVacunadas.keySet()){
            System.out.println(provincia + " --> " + provinciaPersonasVacunadas.get(provincia) + " habitantes");
        }
    }

    public HashSet<Ciudadano> poseeVacunas(HashSet<Vacuna> vacunas){
        HashSet<Ciudadano> contientienen = new HashSet<>();
        for (Ciudadano c:vacunasAplicadas.keySet()){
            boolean contiene = true;
            for (Vacuna v:vacunasAplicadas.get(c)){
                if (!vacunas.contains(v)){
                    contiene = false;
                }
            }
            if (contiene){
                contientienen.add(c);
            }
        }
        return contientienen;
    }

    public void vacunasTiene(HashSet<Vacuna> vacunas){
        HashSet<Ciudadano> contientienen = poseeVacunas(vacunas);
        System.out.println("Ciudadanos que poseen las vacunas:");
        for (Ciudadano c:contientienen){
            System.out.println("- " + c.getNombre() + " " + c.getApellido());
        }
    }

    public void vacunaTiene(Vacuna vacuna){
        HashSet<Vacuna> vac = new HashSet<>();
        vac.add(vacuna);
        HashSet<Ciudadano> contientienen = poseeVacunas(vac);
        System.out.println("Ciudadanos que poseen la vacuna:");
        for (Ciudadano c:contientienen){
            System.out.println("- " + c.getNombre() + " " + c.getApellido());
        }
    }



}
