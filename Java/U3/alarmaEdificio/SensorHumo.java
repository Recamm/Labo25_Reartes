package U3.alarmaEdificio;

public class SensorHumo extends Sensor {
    public SensorHumo(boolean estado, int medida, int umbralInicial, int anioAdquisicion) {
        super(estado, medida, umbralInicial, anioAdquisicion);
    }

    @Override
    public void dispararAlarma(){
        System.out.println("Llamando a bomberos!");
    }
}
