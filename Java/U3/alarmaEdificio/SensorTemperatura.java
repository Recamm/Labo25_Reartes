package U3.alarmaEdificio;

public class SensorTemperatura extends Sensor{
    public SensorTemperatura(boolean estado, int medida, int umbralInicial, int anioAdquisicion) {
        super(estado, medida, umbralInicial, anioAdquisicion);
    }

    @Override
    public void dispararAlarma(){
        System.out.println("Temperatura alta!");
    }
}
