package U3;

public class Auto extends Vehiculo {
    private String patente;
    private boolean descapotables;

    public Auto(String marca, String modelo, String color, int cantidadDeRuedas, int anioFabricacion, String patente, boolean descapotables) {
        super(marca, modelo, color, cantidadDeRuedas, anioFabricacion);
        this.patente = patente;
        this.descapotables = descapotables;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isDescapotables() {
        return descapotables;
    }

    public void setDescapotables(boolean descapotables) {
        this.descapotables = descapotables;
    }
}
