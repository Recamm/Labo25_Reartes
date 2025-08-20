package U7.sistemaAlarmas;

public class Sensor {
    private boolean estado;
    private int medida, umbralInicial, anioAdquisicion;

    public Sensor() {
    }

    public Sensor(boolean estado, int medida, int umbralInicial, int anioAdquisicion) {
        this.estado = estado;
        this.medida = medida;
        this.umbralInicial = umbralInicial;
        this.anioAdquisicion = anioAdquisicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public int getUmbralInicial() {
        return umbralInicial;
    }

    public void setUmbralInicial(int umbralInicial) {
        this.umbralInicial = umbralInicial;
    }

    public int getAnioAdquisicion() {
        return anioAdquisicion;
    }

    public void setAnioAdquisicion(int anioAdquisicion) {
        this.anioAdquisicion = anioAdquisicion;
    }

    public void dispararAlarma(){}

    public void statusAlarma(){
        if(estado && medida > umbralInicial){
            dispararAlarma();
        }
    }
}