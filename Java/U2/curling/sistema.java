package U2.curling;

import U1.Fecha;

import java.time.LocalDate;
import java.util.ArrayList;

public class sistema {
    ArrayList<equipo> equipos = new ArrayList<>();
    ArrayList<partido> partidos;

    public ArrayList<equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<partido> partidos) {
        this.partidos = partidos;
    }

    public sistema(ArrayList<equipo> equipos, ArrayList<partido> partidos) {
        this.equipos = equipos;
        this.partidos = partidos;
    }

    public void agregarEquipos(equipo ejemplo) {
        this.equipos.add(ejemplo);
    }

    public void generarFixture(){
        partidos = new ArrayList<>();
        ArrayList<equipo> turnoM = new ArrayList<>();
        ArrayList<equipo> turnoT = new ArrayList<>();
        ArrayList<equipo> turnoN = new ArrayList<>();

        for (int i = 0; i < equipos.size()-1; i++){
            switch (this.equipos.get(i).getDisponibilidadHoraria()){
                case 'm':
                    turnoM.add(this.equipos.get(i));
                    break;
                case 't':
                    turnoT.add(this.equipos.get(i));
                    break;
                case 'n':
                    turnoN.add(this.equipos.get(i));
                    break;
            }
        }

        for (int turno = 0; turno < 3; turno++){
            for(int i = 0; i < this.equipos.size()-1; i++){
                for (int ii = i+1; i < this.equipos.size()-1; i++){
                    partido match = new partido();
                    switch (turno){
                        case 0:
                            match = new partido(LocalDate.now(), 'm', turnoM.get(i), turnoM.get(ii));
                            partidos.add(match);
                            break;
                        case 1:
                            match = new partido(LocalDate.now(), 't', turnoM.get(i), turnoM.get(ii));
                            partidos.add(match);
                            break;
                        case 2:
                            match = new partido(LocalDate.now(), 'n', turnoM.get(i), turnoM.get(ii));
                            partidos.add(match);
                            break;
                    }
                }
            }
        }

    }
}