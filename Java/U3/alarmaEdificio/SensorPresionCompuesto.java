package U3.alarmaEdificio;

import java.util.ArrayList;

public class SensorPresionCompuesto extends SensorPresion {
    private ArrayList<SensorPresion> grupoPresion;

    public SensorPresionCompuesto(ArrayList<SensorPresion> grupoPresion) {
        super();
        this.grupoPresion = grupoPresion;
    }

    public ArrayList<SensorPresion> getGrupoPresion() {
        return grupoPresion;
    }

    public void setGrupoPresion(ArrayList<SensorPresion> grupoPresion) {
        this.grupoPresion = grupoPresion;
    }

    public void agregarSensorPresion(SensorPresion sensorPresion) {
        grupoPresion.add(sensorPresion);
    }

    public void eliminarSensorPresion(SensorPresion sensorPresion) {
        grupoPresion.remove(sensorPresion);
    }

    @Override
    public void statusAlarma(){
        int sumaMedida = 0;
        for (SensorPresion sensorPresion : grupoPresion) {
            sumaMedida += sensorPresion.getMedida();
        }
        if (isEstado() && sumaMedida/3 > this.getUmbralInicial()){
            dispararAlarma();
        }
    }
}
