package vacunas;

import java.time.LocalDate;

public class Vacuna {
    private LocalDate fechaFabricacion, fechaAplicacion;
    private int nroLote, nroFabricacion;
    private String nombreComercial;

    public Vacuna(LocalDate fechaFabricacion, int nroLote, int nroFabricacion, String nombreComercial) {
        this.fechaFabricacion = fechaFabricacion;
        this.nroLote = nroLote;
        this.nroFabricacion = nroFabricacion;
        this.nombreComercial = nombreComercial;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(LocalDate fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    public int getNroFabricacion() {
        return nroFabricacion;
    }

    public void setNroFabricacion(int nroFabricacion) {
        this.nroFabricacion = nroFabricacion;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
}
