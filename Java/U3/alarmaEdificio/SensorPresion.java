package U3.alarmaEdificio;

public class SensorPresion extends Sensor{
    public SensorPresion() {
    }

    public SensorPresion(boolean estado, int medida, int umbralInicial, int anioAdquisicion) {
        super(estado, medida, umbralInicial, anioAdquisicion);
    }

    @Override
    public void dispararAlarma(){
        System.out.println("Sensor de presion activado!");
    }
}
